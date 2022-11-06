package Logica.relaciones;

import jakarta.persistence.*;
import Logica.entidades.Competencia;
import Logica.entidades.Puesto;

@Entity
@Table(name= "Ponderacion_Competencia")
public class PonderacionCompetencia {
	
	@EmbeddedId
	private PuestoCompetencia id = new PuestoCompetencia();
	
	@ManyToOne
	@MapsId("id_puesto")
	public Puesto puesto;
	@Column(name = "ponderacion")
	public Integer ponderacion;
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId("id_competencia")
	public Competencia competencia;
	
	public PonderacionCompetencia(Integer ponderacion, Competencia competencia) {
		super();
		this.ponderacion = ponderacion;
		this.competencia = competencia;
	}

	public Integer getPonderacion() {
		return ponderacion;
	}

	public void setPonderacion(Integer ponderacion) {
		this.ponderacion = ponderacion;
	}

	public Competencia getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}
}

