package com.sinensia.bcnmeteo.frontend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinensia.bcnmeteo.backend.business.model.Estacion;
import com.sinensia.bcnmeteo.backend.business.services.EstacionServices;

@Controller
@RequestMapping("/bcnmeteo")
public class AppEstacionController {

	@Autowired
	private EstacionServices estacionServices;

	@GetMapping("/estaciones")
	public String getListado(Model model) {
		List<Estacion> estaciones = estacionServices.getAll();
		model.addAttribute("estaciones", estaciones);
		return "listado_estaciones";
	}

}
