package com.trifulcas.springprueba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/form")
	public String verForm(Model modelo) {
		Alumno alumno = new Alumno();
		
		modelo.addAttribute("alumno", alumno);
		return "form-alumno";
	}
	
	@RequestMapping("/procesar")
	public String procesarForm(@Valid @ModelAttribute("alumno") Alumno alumno, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form-alumno";
		}
		else {
			return "ver-alumno";
		}
	}
	
}
