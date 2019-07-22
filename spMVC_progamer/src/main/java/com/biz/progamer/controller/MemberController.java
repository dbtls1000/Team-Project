package com.biz.progamer.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.progamer.model.MemberVO;
import com.biz.progamer.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService mService;
	// 로그인부분
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("BODY","LOGIN");
		return "home";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(@ModelAttribute MemberVO memberVO, Model model,
			HttpSession httpSession) {
		if(memberVO != null) httpSession.setAttribute("USER", memberVO);
		return "redirect:/";
	}
	// 회원가입부분
	@RequestMapping(value="join",method=RequestMethod.GET)
	public String join(Model model) {
		model.addAttribute("BODY","JOIN");
		return "home";
	}
	@RequestMapping(value="join",method=RequestMethod.POST)
	public String join(@ModelAttribute MemberVO memberVO, Model model) {
		
		mService.insert(memberVO);
		if(memberVO.getM_password() != memberVO.getM_repassword()) return "join";
		
		model.addAttribute("MEMBER",memberVO);
		model.addAttribute("BODY","MEMBER-VIEW");
		return "home";
	}
	// 로그아웃부분
	@RequestMapping(value="logout",method=RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.setAttribute("ADMIN", null);
		httpSession.setAttribute("USER", null);
		return "home";
	}
}
