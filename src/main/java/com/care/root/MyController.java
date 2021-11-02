package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value="index")	//url경로(인터넷창)
	public String memberIndex() {
		return "member/index";		//src/main/webapp/WEB-INF/views의 경로
	}
	
	@RequestMapping("logout")					//단일 값이 들어갈 땐 value 생략 가능
	public String memberLogout(Model model) {	//spring에서 model이라는 객체를 넘겨줌, request와 비슷
		model.addAttribute("key",/*value*/"로그아웃 되었습니다");	//값을 전달
		return "member/logout";
	}
	
	@RequestMapping(value="login")
	public ModelAndView memberLogin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login", "로그인 성공!");
		mv.setViewName("member/login");
		return mv;
	}
}
