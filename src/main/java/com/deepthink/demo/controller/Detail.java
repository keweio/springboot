package com.deepthink.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deepthink.demo.service.DetailService;



@Controller
@RequestMapping("/Detail")
public class Detail {
	
	private static Logger logger = LoggerFactory.getLogger(Detail.class);
	
	@Autowired
	private DetailService DetailService;
	
	@ResponseBody
	@RequestMapping(value = "/detail", produces = "application/json; charset=utf-8")
	public Object detail( ) {
		
		
		return DetailService;
	}
}
