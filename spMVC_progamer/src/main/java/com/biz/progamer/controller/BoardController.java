package com.biz.progamer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
