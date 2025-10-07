package com.sharito.demo.db.service;

import org.springframework.stereotype.Service;

import com.sharito.demo.db.dto.PersonaDto;

@Service
public class PersonaService {

	public PersonaDto crearPersona(PersonaDto personaDto) {
		PersonaDto persona = new PersonaDto(personaDto.getId(), personaDto.getNombre(), personaDto.getPrimerApellido(), personaDto.getSegundoApellido());
		return persona;
	}

}
