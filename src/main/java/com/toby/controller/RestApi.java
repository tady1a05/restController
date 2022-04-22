package com.toby.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	@GetMapping("/")
	public String test() {
		return "Test";
	}
}
