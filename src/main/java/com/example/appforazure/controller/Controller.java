package com.example.appforazure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")

	public String sayHelllo() {

		return "Hello world";

	}
}
