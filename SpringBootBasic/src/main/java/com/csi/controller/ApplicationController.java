package com.csi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
	
	@GetMapping
	public String sayHello()
	{
		return "WELCOME TO NASHIK";
	}
	
	@GetMapping("/service")
	public String sayService()
	{
		return "SOFTWARE DEVELOPMENT SERVICE";
	}
	
	@GetMapping("/address")
	public String sayAddress()
	{
		return "MH|India";
	}
	
	
	@GetMapping("/listofemployeedata")
	public List<Employee> getAllData()
	{
		return Stream.of(new Employee(121, "Aakash Rao")).collect(Collectors.toList());
	}
	

}
