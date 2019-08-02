package com.biz.progamer.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biz.progamer.model.MemberVO;
import com.biz.progamer.service.MemberService;

@Controller
@RequestMapping(value="/member")
public class MemberController {
	
	@Autowired
	MemberService mService;
	//로그인부분
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("BODY","LOGIN");
		return "body/login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute MemberVO memberVO, Model model,
			HttpSession httpSession) {
		memberVO = mService.login(memberVO);
		if(memberVO != null) httpSession.setAttribute("USER", memberVO);
		return "redirect:/";
	}
	//회원가입
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join(Model model) {
		return "body/join";
	}
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(@ModelAttribute MemberVO memberVO, Model model) {
		int ret =mService.insert(memberVO);
		return "redirect:/";
	}
	//로그아웃
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.setAttribute("ADMIN", null);
		httpSession.setAttribute("USER", null);
		return "redirect:/";
	}
	@ResponseBody
	@RequestMapping(value="/check_id",method=RequestMethod.GET)
	public String check_id(@RequestParam String m_userid, Model model) {
		return mService.check_id(m_userid);
	}
}
