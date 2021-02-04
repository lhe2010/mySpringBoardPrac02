package com.spring.BoardPrac02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.BoardPrac02.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/")
	public String main() {
		return "boardPrac02/main";
	}
	
	@RequestMapping(value="/boardList")
	public String boardList(Model model) throws Exception {
		
		model.addAttribute("boardList", boardService.listAll());
		
		return "boardPrac02/bList";
	}

}
