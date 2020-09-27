package com.ayushman.spring.springmvc.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

		ctx.register(SpringConfig.class);

		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));

		servlet.setLoadOnStartup(1);

		servlet.addMapping("/");
	}

}
