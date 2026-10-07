package com.cicdPipeline.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelthController {

	@GetMapping("/health")
	public String helthCheck() {
		return "Helth is Good!";
	}
}
