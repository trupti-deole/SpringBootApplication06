package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String landingPage()
	{
		return "index";
	}
	
	@RequestMapping(value="/log")
	public String logPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String loginPage(@RequestParam String name,@RequestParam String pwd,Model m)
	{
		if(name.equalsIgnoreCase("cjc")&&pwd.equals("cjc123"))
		{
			System.out.println("Login successfully");
			m.addAttribute("uname",name);
			m.addAttribute("pwd",pwd);
			return "success";
		}
		return "index";
	}
	@RequestMapping(value="/reg")
	public String regPage()
	{
		return "register";
	}
	
	@RequestMapping(value="/register")
	public String registerPage(@ModelAttribute Employee emp,Model m)
	{
		System.out.println(emp.getName());
		System.out.println(emp.getEmpId());
		System.out.println(emp.getMarks());
		System.out.println(emp.getPwd());
		System.out.println(emp.getAdd());
		m.addAttribute("data",emp);
		return "myregsuccess";
	}
}
