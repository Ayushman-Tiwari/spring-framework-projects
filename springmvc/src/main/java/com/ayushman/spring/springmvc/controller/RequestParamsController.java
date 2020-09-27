package com.ayushman.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {

	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value = "salary", required = false, defaultValue = "10000.0") double salary) {

		System.out.println("id: "+id + " name: " + name+" salary: "+salary);
		
		
		ModelAndView modelAndView = new ModelAndView("userReg");

		return modelAndView;

	}

}
