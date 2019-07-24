package com.biz.progamer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.progamer.model.ProgamerVO;
import com.biz.progamer.service.ProgamerService;

@Controller
@RequestMapping(value="/gamer")
public class GamerController {
	
	@Autowired
	ProgamerService pgService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String view_gamer(@ModelAttribute ProgamerVO pgVO, Model model) {
		List<ProgamerVO> pgList = pgService.selectAll();
		model.addAttribute("GLIST",pgList);
		model.addAttribute("BODY","GAMER_VIEW");
		return "home";
	}
	@RequestMapping(value="sktt1",method=RequestMethod.GET)
	public String view_SKT_T1(Model model) {
		model.addAttribute("BODY","SKT_T1");
		return "home";
	}
	
}
