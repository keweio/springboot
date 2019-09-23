package com.deepthink.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepthink.demo.mapper.DetailMapper;
import com.deepthink.demo.model.Detail;

@Service("DetailService")
public class DetailService {

	@Autowired
	private DetailMapper DetailMapper;
	
	public 	Detail  detail() {
		
		return null;
	}
}
