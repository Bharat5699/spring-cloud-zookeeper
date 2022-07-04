package com.example.foody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foody.client.DinnerClient;
import com.example.foody.request.CheckStatusRequest;
import com.example.foody.response.CheckStatusResponse;

@RestController
@RequestMapping("/foody")
public class FoodyController {

	@Autowired
	DinnerClient dinnerClient;
	
	@PostMapping("/isOpen")
	public CheckStatusResponse checkStatus(@RequestBody CheckStatusRequest req) {
		return dinnerClient.testDay(req);
	}
}
