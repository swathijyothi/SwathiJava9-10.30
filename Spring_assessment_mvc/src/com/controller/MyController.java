package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bo.UserBo;

@Controller
public class MyController {
	
	ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
	UserBo ub=(UserBo) a.getBean("userBo");
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public  String index() {
		return "index";
	}

}
