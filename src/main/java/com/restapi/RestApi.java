package com.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi  {
	//newBranch
	@Autowired
	FeignClient feignClient;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hi Jyothi";
	}
	
	@GetMapping("/")
	public String sayFeign() {
		
	return feignClient.sayFeign();
	}
}
