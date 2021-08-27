package com.zero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zero.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	
	
	private BoardService service;
	
	
	@GetMapping("/list")
	public String list(Model model) {
		log.info("list");
		model.addAttribute("list",service.getList());
		log.info("----------------why???");
		return "list";
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("bno") Long bno, Model model) {
		
		log.info("get");
		model.addAttribute("list",service.get(bno));
	}
	
	
	
	
	
	
	
	
	
	

}
