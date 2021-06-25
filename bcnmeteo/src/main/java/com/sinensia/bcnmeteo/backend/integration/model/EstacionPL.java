package com.sinensia.bcnmeteo.backend.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ESTACIONES")
public class EstacionPL implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@TableGenerator(name="MI_GENERADOR",
			table="SECUENCIAS",
			pkColumnName="SEQ_NAME",
			valueColumnName="SEQ_VALUE",
			pkColumnValue="ESTACIONES",
			allocationSize=1)

	@GeneratedValue(strategy=GenerationType.TABLE, generator="MI_GENERADOR")
	@Id
	private int id;
	
	private String nombre;
	
	@ElementCollection
	@OrderColumn(name="INDICE")	
	@CollectionTable(name="DIRECCIONES", joinColumns = @JoinColumn(name="CODIGO_ESTACION"))
	private List<DireccionPL> direccion;
	
	private double latitud;
	private double longitud;
	
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	
	@Temporal(TemporalType.DATE)
	private Date ultimaRevision;
	
	private int intervaloTiempo;

	@Enumerated(EnumType.STRING)
	private EstadoPL estado;

	public EstacionPL() {

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

	public List<DireccionPL> getDireccion() {
		return direccion;
	}

	public void setDireccion(List<DireccionPL> direccion) {
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

	public EstadoPL getEstado() {
		return estado;
	}

	public void setEstado(EstadoPL estado) {
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
		EstacionPL other = (EstacionPL) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EstacionPL [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", latitud=" + latitud
				+ ", longitud=" + longitud + ", fechaAlta=" + fechaAlta + ", ultimaRevision=" + ultimaRevision
				+ ", intervaloTiempo=" + intervaloTiempo + ", estado=" + estado + "]";
	}

}
