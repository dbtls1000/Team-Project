package com.biz.progamer.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.progamer.model.BoardVO;
import com.biz.progamer.service.BoardService;


@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	BoardService bService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		List<BoardVO> bList = bService.selectAll();
		model.addAttribute("BLIST",bList);
		model.addAttribute("BODY","BOARD_LIST");
		return "home";
		
	}
	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public String write(@ModelAttribute("boardVO") BoardVO boardVO, Model model) {
		
		
		LocalDateTime ldt = LocalDateTime.now();
		String curDate = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toString();
		String curTime = ldt.format(DateTimeFormatter.ofPattern("HH-mm-ss")).toString();
		
		boardVO.setB_date(curDate);
		boardVO.setB_time(curTime);
		
		model.addAttribute("boardVO",boardVO);
		model.addAttribute("BODY","BOARD_WRITE");
		return "home";
	}
	
	@RequestMapping(value="/write",method=RequestMethod.POST)
	public String writeiup(@ModelAttribute BoardVO boardVO, Model model) {
		
		int ret = bService.insert(boardVO);
		return "redirect:/board/list";
	}
	
}
