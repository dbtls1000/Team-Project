package com.biz.progamer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biz.progamer.model.ProgamerVO;
import com.biz.progamer.service.ProgamerService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequestMapping(value="/gamer")
public class GamerController {
	
	@Autowired
	ProgamerService pgService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String view_gamer(@ModelAttribute ProgamerVO pgVO, Model model) {
		List<ProgamerVO> pgList = pgService.selectAll();
		model.addAttribute("GLIST",pgList);
		model.addAttribute("BODY","GAMER_LIST");
		return "home";
	}
	
	@RequestMapping(value="/team",method=RequestMethod.GET)
	public String team(@RequestParam(value="pg_team",required=false) String pg_team,Model model) {
		List<ProgamerVO> pgList = pgService.findByTeam(pg_team);
		log.debug("팀 이름 : " + pg_team);
		model.addAttribute("TEAM",pgList);
		return "body/team/view";
	}
	@ResponseBody
	@RequestMapping(value="/team",method=RequestMethod.POST)
	public String team1(@RequestParam(value="pg_team",required=false) String pg_team,Model model) {
		
		log.debug("팀 이름 : " + pg_team);
		
		return "body/team/view";
	}
	
	@RequestMapping(value="/profile",method=RequestMethod.GET)
	public String profile(@RequestParam long pg_num,Model model) {
		ProgamerVO progamerVO = pgService.findByNum(pg_num);
		model.addAttribute("GAMER",progamerVO);
		model.addAttribute("BODY","PROFILE");
		return "home";
	}
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String search(@RequestParam String pg_gamer, Model model) {
		List<ProgamerVO> pgList = pgService.findByNameNick(pg_gamer);
		log.debug("선수 이름 : " + pg_gamer);
		model.addAttribute("SEARCH",pgList);
		model.addAttribute("BODY","SEARCH");
		return "home";
	}
}
