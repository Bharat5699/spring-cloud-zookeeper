package com.example.foody.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.foody.request.CheckStatusRequest;
import com.example.foody.response.CheckStatusResponse;

@Configuration
@EnableDiscoveryClient
@EnableFeignClients
public class DinnerClient {
	
	@Autowired
	TheClient theClient;

	@FeignClient("DinnerService")
	interface TheClient{
		@PostMapping("/dinner/status")
		CheckStatusResponse isOpen(@RequestBody CheckStatusRequest request);
	}
	
	public CheckStatusResponse testDay(CheckStatusRequest request) {
		return theClient.isOpen(request);
	}
}
