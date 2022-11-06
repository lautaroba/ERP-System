package Logica.gestores;

import BaseDeDatos.MySQL.CompetenciaMySQL;
import Logica.entidades.Competencia;

public class GestorCompetencia {
	
	public void CrearCompetencia(Competencia c) {
		//deberia buscarlo
		Competencia nuevaCompetencia = new Competencia(c.getCodigo(), c.getNombre(), c.getDescripcion(), c.getTipoCompetencia());
		CompetenciaMySQL.CrearCompetencia(nuevaCompetencia);
	}
	public void ModificarCompetencia(Competencia p) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarCompetencia(Competencia p) {
		// TODO Auto-generated method stub
		
	}

	public Competencia BuscarCompetencia(Competencia p) {
		
		return null;
	}
}
