package com.sinensia.bcnmeteo.backend.business.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.bcnmeteo.backend.business.model.Estacion;
import com.sinensia.bcnmeteo.backend.business.services.EstacionServices;
import com.sinensia.bcnmeteo.backend.integration.model.EstacionPL;
import com.sinensia.bcnmeteo.backend.integration.repositories.EstacionPLRepository;

@Service
public class EstacionServicesImpl implements EstacionServices {

	@Autowired
	private EstacionPLRepository estacionPlRespository;

	@Autowired
	private DozerBeanMapper mapper;

	@Override
	public List<Estacion> getAll() {
		return estacionPlRespository.findAll().stream().map(x -> mapper.map(x, Estacion.class))
				.collect(Collectors.toList());
	}

	@Override
	public Estacion create(Estacion estacion) {
		final EstacionPL estacionPL = mapper.map(estacion, EstacionPL.class);
		final EstacionPL createdEstacionPL = estacionPlRespository.save(estacionPL);
		return mapper.map(createdEstacionPL, Estacion.class);
	}

	@Override
	public Estacion getById(int id) {
		Optional<EstacionPL> optional = estacionPlRespository.findById(id);
		return optional.isPresent() ? mapper.map(optional.get(), Estacion.class) : null;
	}

}
