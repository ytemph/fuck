package com.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pages")
public class PagesController {

	@RequestMapping("to_login")
	public String toLogin() {
		return "login";
	}
	
}
