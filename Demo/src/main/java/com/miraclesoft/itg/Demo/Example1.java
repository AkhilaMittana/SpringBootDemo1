package com.miraclesoft.itg.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1 {
	@RequestMapping("/")
	int add()
	{
		return 6;
	}
	@RequestMapping("/api1/add")
	public String add(int a,int b)
	{
		int c=a+b;
		return ("A="+a+" B= " + b + " Sum = :"+c);

	}
	
}
