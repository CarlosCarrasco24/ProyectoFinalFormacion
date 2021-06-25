package com.sinensia.bcnmeteo.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.bcnmeteo.backend.business.model.Estacion;
import com.sinensia.bcnmeteo.backend.business.services.EstacionServices;

@RestController
@RequestMapping("/bcnmeteo/api/v1")
@CrossOrigin
public class EstacionController {

	@Autowired
	private EstacionServices estacionServices;

	@GetMapping("/estaciones")
	public List<Estacion> getAll() {
		return estacionServices.getAll();
	}

	@GetMapping("/estaciones/{id}")
	public Estacion getById(@PathVariable Integer id) {
		return estacionServices.getById(id);
	}

	@PostMapping("/estaciones")
	public Estacion create(@RequestBody Estacion estacion) {
		return estacionServices.create(estacion);
	}
}
