package Gestores;

import Entidades.Competencia;
import Base_De_Datos.CompetenciaMySQLDao;
import DTO.CompetenciaDTO;

public class GestorCompetencia{

	public void CrearCompetencia(Competencia c) {
		//deberia buscarlo
		Competencia nuevaCompetencia = new Competencia(c.getCodigo(), c.getNombre(), c.getDescripcion(), c.getTipoCompetencia());
		CompetenciaMySQLDao.CrearCompetencia(nuevaCompetencia);
	}
	public void ModificarCompetencia(CompetenciaDTO p) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarCompetencia(CompetenciaDTO p) {
		// TODO Auto-generated method stub
		
	}

	public Competencia BuscarCompetencia(CompetenciaDTO p) {
		
		return null;
	}


}
