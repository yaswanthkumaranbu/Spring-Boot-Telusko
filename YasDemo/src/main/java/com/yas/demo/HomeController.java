package com.yas.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		String name = req.getParameter("name");
		System.out.println("hii "+name);
		return "home.jsp";
		
	}
}
