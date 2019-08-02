package com.biz.progamer.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
	private long b_seq;//	NUMBER	Primary Key,
	private long b_main_seq;//	NUMBER	,
	private int b_layer;//	NUMBER	,
	private String b_date;//	VARCHAR2(10)	,
	private String b_time;//	VARCHAR2(20)	,
	private String b_auth;//	nVARCHAR2(50)	,
	private String b_title;//	nVARCHAR2(50)	,
	private String b_content;//	nVARCHAR2(50)
	
	private List<MultipartFile> b_files;
}
