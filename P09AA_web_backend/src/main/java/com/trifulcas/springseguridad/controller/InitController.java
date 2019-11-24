package com.trifulcas.springseguridad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; 

@Controller
public class InitController {

	@GetMapping("/")
	public String inicio() {
		// página web inicial
		return "index";
	}
	
	@GetMapping("/formLogin")
	public String formLogin() {
		return "login";
	}

	@GetMapping("/prohibido")
	public String prohibido() {
		return "prohibido";
	}

	@GetMapping("/logout")
	public String logout() {
		return "prohibido";
	}
	
}

