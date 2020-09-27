package com.ayushman.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayushman.spring.springjdbc.employee.dao.EmployeeDao;
import com.ayushman.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/ayushman/spring/springjdbc/employee/test/config.xml");

		EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");

		Employee emp = new Employee();

		emp.setId(2);
		emp.setFirstName("Nitish");
		emp.setLastName("Kumar");

//		int result = employeeDao.create(emp);

//		int result = employeeDao.update(emp);

//		int result = employeeDao.delete(2);
		
//		Employee employee = employeeDao.read(1);
	
		List<Employee> employees = employeeDao.read();
		
//		System.out.println("Number of records deleted are: " + result);
	
		System.out.println("Employee records:" + employees);
	}

}
