package com.sinensia.bcnmeteo.backend.integration.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sinensia.bcnmeteo.backend.integration.model.EstacionPL;


@DataJpaTest
public class EstacionPLRepositoryTest {
	
	@Autowired
	private EstacionPLRepository estacionPLRepository;
	
	@Test
	public void should_store_a_estacion() {
		
		EstacionPL estacionPL = new EstacionPL();
		estacionPL.setNombre("Estacion MariCarmen");
		
		EstacionPL createdEstacionPL = estacionPLRepository.save(estacionPL);
		
		assertEquals("Estacion MariCarmen", createdEstacionPL.getNombre());
		assertNotEquals(0, createdEstacionPL.getId());
	}
	
	@Test
	public void should_retrieve_a_estacion_by_id() {
		
		Optional<EstacionPL> optional = estacionPLRepository.findById(1);
		assertTrue(optional.isPresent());
		EstacionPL estacionPL = optional.get();
		assertEquals("Estacion Galileo Galilei", estacionPL.getNombre());		
	}
	
	@Test
	public void should_retrieve_all_estacion() {
		List<EstacionPL> estaciones = estacionPLRepository.findAll();
		assertEquals(3, estaciones.size());
	}

}
