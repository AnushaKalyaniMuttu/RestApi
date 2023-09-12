package com.restapi;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(url="http://localhost:8081/",name="feign")
public interface FeignClient {

	@GetMapping("/")
	public String sayFeign();
}
