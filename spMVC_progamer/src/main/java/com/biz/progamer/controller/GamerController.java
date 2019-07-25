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
	@RequestMapping(value="griffin",method=RequestMethod.GET)
	public String view_GRIFFIN(Model model) {
		model.addAttribute("BODY","GRIFFIN");
		return "home";
	}
	@RequestMapping(value="kz",method=RequestMethod.GET)
	public String view_KZ(Model model) {
		model.addAttribute("BODY","KZ");
		return "home";
	}
	@RequestMapping(value="damwon",method=RequestMethod.GET)
	public String view_DAMWON(Model model) {
		model.addAttribute("BODY","DAMWON");
		return "home";
	}
	@RequestMapping(value="sandbox",method=RequestMethod.GET)
	public String view_SANDBOX(Model model) {
		model.addAttribute("BODY","SANDBOX");
		return "home";
	}
	@RequestMapping(value="hanhwa",method=RequestMethod.GET)
	public String view_HANHWA(Model model) {
		model.addAttribute("BODY","HANHWA");
		return "home";
	}
	@RequestMapping(value="geng",method=RequestMethod.GET)
	public String view_GENG(Model model) {
		model.addAttribute("BODY","GENG");
		return "home";
	}
	@RequestMapping(value="afreeca",method=RequestMethod.GET)
	public String view_AFREECA(Model model) {
		model.addAttribute("BODY","AFREECA");
		return "home";
	}
	@RequestMapping(value="jinair",method=RequestMethod.GET)
	public String view_JINAIR(Model model) {
		model.addAttribute("BODY","JINAIR");
		return"home";
	}
	@RequestMapping(value="kt",method=RequestMethod.GET)
	public String view_KT(Model model) {
		model.addAttribute("BODY","KT");
		return "home";
	}
}
