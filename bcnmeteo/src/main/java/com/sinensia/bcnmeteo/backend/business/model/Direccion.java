package com.sinensia.bcnmeteo.backend.business.model;

import java.io.Serializable;

public class Direccion implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String calle;
	private String codigoPostal;
	private String poblacion;
	private String provincia;
	private String pais;
	
	public Direccion() {
		
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", codigoPostal=" + codigoPostal + ", poblacion=" + poblacion
				+ ", provincia=" + provincia + ", pais=" + pais + "]";
	}

}
