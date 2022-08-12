package com.service.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {
	@GetMapping("/listup")
	public String listup() {
		return "Hello";
	}
}
