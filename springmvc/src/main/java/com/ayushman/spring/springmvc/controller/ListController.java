package com.ayushman.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ayushman.spring.springmvc.controller.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("John Wick");
		employee.setSalary(25000);
		
		Employee employee2 = new Employee();
		employee2.setId(1235);
		employee2.setName("Bilbo Baggins");
		employee2.setSalary(10000);
		
		Employee employee3 = new Employee();
		employee3.setId(1236);
		employee3.setName("Gandalf");
		employee3.setSalary(50000);
		
		Employee employee4 = new Employee();
		employee4.setId(1237);
		employee4.setName("Galadriel");
		employee4.setSalary(45000);
		
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

}
