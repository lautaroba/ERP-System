package Logica.entidades;

import java.util.Date;

import Logica.enumeraciones.EstadoCuestionario;

public class Cuestionario {
	public String nombre;
	public Date tiempo;
	public EstadoCuestionario estado;
	public String clave;

	public Cuestionario(String nombre, Date tiempo, EstadoCuestionario estado, String clave) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.estado = estado;
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getTiempo() {
		return tiempo;
	}

	public void setTiempo(Date tiempo) {
		this.tiempo = tiempo;
	}

	public EstadoCuestionario getEstado() {
		return estado;
	}

	public void setEstado(EstadoCuestionario estado) {
		this.estado = estado;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
