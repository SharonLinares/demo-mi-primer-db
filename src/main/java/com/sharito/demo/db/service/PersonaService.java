package com.sharito.demo.db.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sharito.demo.db.dto.PersonaDto;
import com.sharito.demo.db.entity.PersonaEntity;
import com.sharito.demo.db.repository.PersonaRepository;

@Service
public class PersonaService {

	private PersonaRepository personaRepository;

	public PersonaService(PersonaRepository personaRepository) {
		super();
		this.personaRepository = personaRepository;
	}

	public PersonaDto crearPersona(PersonaDto personaDto) {

		PersonaEntity personaEntity = new PersonaEntity();

		personaEntity.setNombre(personaDto.getNombre());
		personaEntity.setPrimerApellido(personaDto.getPrimerApellido());
		personaEntity.setSegundoApellido(personaDto.getSegundoApellido());
		personaEntity.setDni(personaDto.getDni());

		personaRepository.save(personaEntity);

		personaDto.setId(personaEntity.getId());
		return personaDto;

	}

	public PersonaDto obtenerPersonaPorId(Integer id) {

		return null;
	}

	public PersonaDto buscarPersonaPorDni(String dni) {
		PersonaEntity personaEntity = personaRepository.findByDni(dni);
		if (personaEntity == null) {
			return null;
		}

		PersonaDto personaDto = new PersonaDto(personaEntity.getId(), personaEntity.getNombre(),
				personaEntity.getPrimerApellido(), personaEntity.getSegundoApellido(), personaEntity.getDni());

		return personaDto;

	}
	
	public List<PersonaDto> buscarPersonasPorApellido(String primerApellido) {
	    List<PersonaEntity> personasEntity = personaRepository.findByPrimerApellido(primerApellido);

	    if (personasEntity == null || personasEntity.isEmpty()) {
	        return new ArrayList<>();
	    }

	    List<PersonaDto> personasDto = new ArrayList<>();

	    for (PersonaEntity personaEntity : personasEntity) {
	        PersonaDto personaDto = new PersonaDto();
	        personaDto.setId(personaEntity.getId());
	        personaDto.setNombre(personaEntity.getNombre());
	        personaDto.setPrimerApellido(personaEntity.getPrimerApellido());
	        personaDto.setSegundoApellido(personaEntity.getSegundoApellido());
	        personaDto.setDni(personaEntity.getDni());

	        personasDto.add(personaDto);
	    }

	    return personasDto;
	}

	public List<PersonaDto> consultarPersonas() {
		List<PersonaDto> personas = new ArrayList<>();
		List<PersonaEntity> personasEntity = personaRepository.findAll();

		for (PersonaEntity personaEntity : personasEntity) {
			PersonaDto personaDto = new PersonaDto();
			personaDto.setId(personaEntity.getId());
			personaDto.setNombre(personaEntity.getNombre());
			personaDto.setPrimerApellido(personaEntity.getPrimerApellido());
			personaDto.setSegundoApellido(personaEntity.getSegundoApellido());

			personas.add(personaDto);

		}

		return personas;
	}

}
