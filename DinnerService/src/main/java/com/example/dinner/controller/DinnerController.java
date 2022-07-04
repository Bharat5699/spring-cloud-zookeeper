package com.example.dinner.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dinner.request.DinnerRequest;
import com.example.dinner.response.DinnerResponse;

@RestController
@RequestMapping("/dinner")
public class DinnerController {
	
	@Value("${server.port}")
	String port;

	@PostMapping("/status")
	public DinnerResponse checkStatus(@RequestBody DinnerRequest dinnerRequest) {
		System.out.println("service call on port:"+port);
		DinnerResponse res=new DinnerResponse();
		if(dinnerRequest.getDay().equalsIgnoreCase("SUNDAY")) {
			res.setStatus("CLOSED");
		}else {
			res.setStatus("OPENED");
		}
		
		return res;
		
	}
	
}
