package com.Hussain.boottomvc1.boottomvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Hussain.boottomvc1.boottomvcdemo.entity.Student;

@Controller
public class MyController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getDetails(@ModelAttribute("index")Student student)
	{
		return "index";
	}
	
	@RequestMapping(value="/submitlogin",method=RequestMethod.POST)
	public String showDetails(@ModelAttribute("index")Student student)
	{
		return "Success";
	}
	
	

}
