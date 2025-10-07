package com.sharito.demo.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharito.demo.db.dto.PersonaDto;
import com.sharito.demo.db.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	private PersonaService personaService;

	public PersonaController(PersonaService personaService) {
		super();
		this.personaService = personaService;
	}

	
	@PostMapping("/crear-persona")
	public PersonaDto crearPersona(@RequestBody PersonaDto personaDto) {
		return personaService.crearPersona(personaDto);
	}
	
	
}
