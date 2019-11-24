package com.trifulcas.springseguridad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/private")
public class PrivateWebController {
	
	@GetMapping("/index")
	public String initPrivate() {
		// acceso a web de empleados y colaboradores
		return "private/index";
	}
	
	@GetMapping("/admin")
	public String initAdmin() {
		// Área Administración
		return "private/index-admin";
	}
	
	@GetMapping("/editor")
	public String initEditor() {
		// Área Editorial
		return "private/index-editor";
	}
	
	@GetMapping("/colab")
	public String initColab() {
		// Colaboradores
		return "private/index-colab";
	}
	
}