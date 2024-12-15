package com.yas.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
//	public String home(HttpServletRequest req, HttpServletResponse res) {
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
//		System.out.println("hii "+name);
//		session.setAttribute("name", name);
//		return "home.jsp";
//	}
	
	
//	@RequestMapping("home")
//	public String home(String name, HttpSession session) {
//		System.out.println("hii "+name);
//		session.setAttribute("name", name);
//		return "home.jsp";
//	}
	
//	@RequestMapping("home") 
//	public String home(@RequestParam("name") String myName, HttpSession session) {
//		System.out.println("hii "+myName);
//		session.setAttribute("name", myName);
//		return "home.jsp";
//	}
	
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myName) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("home.jsp");
//		mv.addObject("name", myName);
//		return mv;
//	}
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.jsp");
		mv.addObject("obj", alien);
		return mv;
	}
}
