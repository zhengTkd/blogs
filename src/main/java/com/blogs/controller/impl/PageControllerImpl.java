package com.blogs.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.blogs.controller.PageController;

@Controller
public class PageControllerImpl implements PageController {
	
	@RequestMapping("/")
	@ResponseBody
	public ModelAndView index() {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("index");
		List<String> userinfo=new ArrayList<>();
		userinfo.add("张三");
		userinfo.add("李四");
		modelAndView.addObject("user", userinfo);
		return modelAndView;
	}
}
