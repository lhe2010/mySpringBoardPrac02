package com.spring.BoardPrac02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping(value="/")
	public String main() {
		return "boardPrac02/main";
	}

}
