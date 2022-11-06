package BaseDeDatos.MySQL;

import BaseDeDatos.Conexion.Temporal;
import Logica.entidades.Competencia;

public class CompetenciaMySQL {
	
	public static void CrearCompetencia(Competencia c) {
		Temporal.entity.getTransaction().begin();
		Temporal.entity.persist(c);
		Temporal.entity.getTransaction().commit();
	}
	public void ModificarCompetencia(Competencia c) {
		// TODO Auto-generated method stub

	}
	public void EliminarCompetencia(Competencia c) {
		// TODO Auto-generated method stub

	}
	public Competencia BuscarCompetencia(Competencia c) {
		return Temporal.entity.find(Competencia.class, c.getCodigo());
	}
	
}
