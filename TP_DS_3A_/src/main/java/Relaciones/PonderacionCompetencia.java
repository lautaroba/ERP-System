package Relaciones;

import Entidades.Competencia;
import Entidades.Puesto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

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
