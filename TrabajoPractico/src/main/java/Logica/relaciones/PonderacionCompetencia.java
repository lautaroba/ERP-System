package Logica.relaciones;

import javax.persistence.*;
import Logica.entidades.Competencia;

@Entity
@Table(name= "Ponderacion_Competencia")
public class PonderacionCompetencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pc")
	private int id;
	@Column(name = "ponderacion")
	public Integer ponderacion;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_competencia", referencedColumnName = "id_competencia")
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

