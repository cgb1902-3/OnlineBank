package com.bank.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("doIndex")
	public String test(){
		return "index";
	}
	@RequestMapping("doUserMessage")
	public String doUserMessage() {
		return "usermessage";
	}
}
