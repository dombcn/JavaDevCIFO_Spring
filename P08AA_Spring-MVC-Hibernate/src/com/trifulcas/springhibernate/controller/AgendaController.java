package com.trifulcas.springhibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import com.trifulcas.springhibernate.service.IAgendaService;
import com.trifulcas.springhibernate.entity.Contacto;

@Controller
@RequestMapping("/agenda")
public class AgendaController {
	
	@Autowired
	private IAgendaService agendaService;
	
	@RequestMapping("/contacto/lista")
	public String listaContactos(Model modelo) {
		List<Contacto> contactos=agendaService.getContactos();
		modelo.addAttribute("contactos",contactos);
		return "lista-contactos";
	}
	
	@GetMapping("/contacto/addcontacto")
	public String addContacto(Model modelo) {
		Contacto contacto = new Contacto();
		modelo.addAttribute("contacto", contacto);
		return "form-contacto";
	}
	
	@PostMapping("/contacto/savecontacto")
	public String saveContacto(@Valid @ModelAttribute("contacto") Contacto contacto, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form-contacto";
		}
		else {
			agendaService.saveContacto(contacto);
			return "redirect:/agenda/contacto/lista";
		}
	}
	
	@GetMapping("/contacto/updatecontacto")
	public String updateContacto(@RequestParam("idcontacto") int idcontacto, Model modelo) {
		Contacto contacto=agendaService.getContacto(idcontacto);
		modelo.addAttribute("contacto", contacto);
		return "form-contacto";
	}
	
	@GetMapping("/contacto/deletecontacto")
	public String deleteContacto(@RequestParam("idcontacto") int idcontacto) {
		Contacto contacto = agendaService.getContacto(idcontacto);
		agendaService.deleteContacto(contacto);
		return "redirect:/agenda/contacto/lista";
	}
	
	// Además de Contactos la Agenda podría tener también Eventos, Citas, Recordatorios, ...
	
}
