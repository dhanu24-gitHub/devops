package com.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	
	@GetMapping(value = "/heyLove")
	public String getMsg() {
		return "I'm so lucky to get YOU Babyyyy";
	}

}
