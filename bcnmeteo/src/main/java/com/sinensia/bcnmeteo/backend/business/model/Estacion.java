package com.sinensia.bcnmeteo.backend.business.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Estacion implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;
	private List<Direccion> direccion;
	private double latitud;
	private double longitud;
	private Date fechaAlta;
	private Date ultimaRevision;
	private int intervaloTiempo;
	private Estado estado;

	public Estacion() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Direccion> getDireccion() {
		return direccion;
	}

	public void setDireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getUltimaRevision() {
		return ultimaRevision;
	}

	public void setUltimaRevision(Date ultimaRevision) {
		this.ultimaRevision = ultimaRevision;
	}

	public int getIntervaloTiempo() {
		return intervaloTiempo;
	}

	public void setIntervaloTiempo(int intervaloTiempo) {
		this.intervaloTiempo = intervaloTiempo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estacion other = (Estacion) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estacion [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", latitud=" + latitud
				+ ", longitud=" + longitud + ", fechaAlta=" + fechaAlta + ", ultimaRevision=" + ultimaRevision
				+ ", intervaloTiempo=" + intervaloTiempo + ", estado=" + estado + "]";
	}

}
