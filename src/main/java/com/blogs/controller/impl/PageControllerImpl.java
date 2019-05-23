package com.blogs.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blogs.controller.PageController;

@Controller
public class PageControllerImpl implements PageController {
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
