package com.sinensia.bcnmeteo.backend.business.services;

import java.util.List;

import com.sinensia.bcnmeteo.backend.business.model.Estacion;

public interface EstacionServices {
	
	public List<Estacion> getAll();
	public Estacion create(Estacion estacion);
	public Estacion getById(int id);

}
