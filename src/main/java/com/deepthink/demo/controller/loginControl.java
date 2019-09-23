package com.deepthink.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.deepthink.demo.model.User;
import com.deepthink.demo.service.LoginService;

@Controller
@RequestMapping("/Login")
public class loginControl {
	
	@Autowired
	private LoginService LoginService;
	
	private static Logger logger = LoggerFactory.getLogger(loginControl.class);

	@ResponseBody
	@RequestMapping(value="Login" ,produces = "application/json; charset=utf-8")
	public User login (@RequestBody JSONObject params){
		logger.info("queryByRechargeDeductionId invoke.rechargeDeduction:" + params);
		long id =  params.getLong("id");
		return LoginService.querybyUserId(id);
	}
}

