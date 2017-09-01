package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class view {
	
	@RequestMapping(value="/")
	public String view(){
		return "home";
	}

}
