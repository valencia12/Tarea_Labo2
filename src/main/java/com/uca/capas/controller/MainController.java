package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;


@Controller
public class MainController {
	@GetMapping("/login")
	public String sendForm(Usuario usuario) { return "login"; }
	
	@PostMapping("/validacion")
	public String processForm(Usuario usuario) {
		/*
		 * Username = Admin
		 * Password = admin 
		 */
		if(usuario.getUsername().equals("Admin") && usuario.getPassword().toLowerCase().equals("admin"))
			return "mostrarMensajeV";
		else
			return "mostrarMensajeF";
	}
}
