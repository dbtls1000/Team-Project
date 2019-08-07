package com.biz.progamer.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.biz.progamer.mapper.FileDao;
import com.biz.progamer.model.BoardVO;
import com.biz.progamer.model.FileVO;

@Service
public class FileService {
	
	@Autowired
	FileDao fDao;
	
	private final String upLoadFolder = "C:/bizwork/upload";
	
	public void uploadFileList(BoardVO boardVO){
		
		List<MultipartFile> files = boardVO.getB_files();
		long b_seq = boardVO.getB_seq();
		
		List<FileVO> fileList = new ArrayList<FileVO>();
		for(MultipartFile file : files) {
			String originName = file.getOriginalFilename();
			String uuString = UUID.randomUUID().toString();
			String saveName = uuString + "_" + originName;
			
			
			
			File upLoadFileName = new File(upLoadFolder,saveName);
			try {
				file.transferTo(upLoadFileName);
				fDao.insert(FileVO.builder()
							.file_board_seq(b_seq)
							.file_name(saveName)
							.file_origin_name(originName).build());
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean file_delete(long file_seq) {
		FileVO fileVO = fDao.findBySeq(file_seq);
		File delFile = new File(upLoadFolder, fileVO.getFile_name());
		if(delFile.exists()) {
			delFile.delete();
			fDao.delete(file_seq);
			return true;
		}
		return false;
	}
}
