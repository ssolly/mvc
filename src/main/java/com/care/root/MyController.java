package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value="index")	//url경로(인터넷창)
	public String memberIndex() {
		return "member/index";		//src/main/webapp/WEB-INF/views의 경로
	}
}
