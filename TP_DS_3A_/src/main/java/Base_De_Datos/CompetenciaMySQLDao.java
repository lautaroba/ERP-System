package Base_De_Datos;

import DTO.CompetenciaDTO;
import Entidades.Competencia;
import TP_DS_3A_.TP_DS_3A_.App;

public class CompetenciaMySQLDao {
	
	public static void CrearCompetencia(Competencia c) {
		App.entityManager.getTransaction().begin();
		App.entityManager.persist(c);
		App.entityManager.getTransaction().commit();
	}
	public void ModificarCompetencia(CompetenciaDTO c) {
		// TODO Auto-generated method stub

	}
	public void EliminarCompetencia(CompetenciaDTO c) {
		// TODO Auto-generated method stub

	}
	public Competencia BuscarCompetencia(CompetenciaDTO c) {
		return App.entityManager.find(Competencia.class, c.getCodigo());
	}
	
}
