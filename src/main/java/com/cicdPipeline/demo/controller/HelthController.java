package com.cicdPipeline.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelthController {

	@GetMapping("/health")
	public String helthCheck() {
		return "Health is Good!";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "Demo Controller";
	}
}
