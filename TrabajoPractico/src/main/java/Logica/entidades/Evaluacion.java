package Logica.entidades;

import java.util.Date;

public class Evaluacion {
	public Date fechaInicio;
	public Date fechaFinal;
	public Integer maximoCandidatos;

	public Evaluacion(Date fechaInicio, Date fechaFinal, Integer maximoCandidatos) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.maximoCandidatos = maximoCandidatos;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Integer getMaximoCandidatos() {
		return maximoCandidatos;
	}

	public void setMaximoCandidatos(Integer maximoCandidatos) {
		this.maximoCandidatos = maximoCandidatos;
	}

}
