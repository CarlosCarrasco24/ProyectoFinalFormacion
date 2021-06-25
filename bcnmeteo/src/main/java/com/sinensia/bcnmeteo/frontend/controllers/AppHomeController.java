package com.sinensia.bcnmeteo.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bcnmeteo")
public class AppHomeController {

	@GetMapping(value = { "/home", "/" })
	public String home() {
		return "home";
	}

}
