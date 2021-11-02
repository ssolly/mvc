package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController02_Quiz01 {

	@RequestMapping(value="quiz01/index")
	public String member02Index(Model model) {
		model.addAttribute("basic","기본 페이지");
		return "member02_quiz01/index";
	}
	
	@RequestMapping(value="quiz01/login")
	public String member02Login(Model model) {
		model.addAttribute("login","로그인 페이지");
		return "member02_quiz01/login";
	}
	
	@RequestMapping(value="quiz01/logout") 
	public String member02Logout() {
		return "member02_quiz01/logout";
	}
}
