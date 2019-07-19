package com.biz.progamer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GamerController {
	
	@RequestMapping(value="sktt1",method=RequestMethod.GET)
	public String view_SKT_T1(Model model) {
		model.addAttribute("BODY","SKT_T1");
		return "home";
	}
	
}
