package com.ayushman.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ayushman.spring.springmvc.controller.dto.User;

@Controller
public class UserController {

	// Before Migration
	/*
	 * @RequestMapping("/registrationPage") public ModelAndView
	 * showRegistrationPage() { ModelAndView modelAndView = new ModelAndView();
	 * 
	 * modelAndView.setViewName("userReg");
	 * 
	 * return modelAndView; }
	 */

	// After Migration
	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {

		return "userReg";

	}

	// Before Migration
	/*
	 * @RequestMapping(value = "/registerUser", method = RequestMethod.POST) public
	 * ModelAndView registerUser(@ModelAttribute("user") User user) {
	 * 
	 * System.out.println(user);
	 * 
	 * ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.addObject("user", user);
	 * 
	 * modelAndView.setViewName("regResult");
	 * 
	 * return modelAndView; }
	 */

	// After Migration
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {

		System.out.println(user);
		model.addAttribute("user", user);
		return "regResult";
	}

}
