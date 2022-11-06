package Logica.gestores;

import BaseDeDatos.MySQL.PuestoMySQL;
import Logica.entidades.Puesto;

public class GestorPuesto{

	public void CrearPuesto(Puesto p) {
		//deberia buscarlo
		Puesto nuevoPuesto = new Puesto(p.getCodigo(), p.getNombre(), p.getDescripcion(), p.getEmpresa(), p.getPonderaciones());
		PuestoMySQL.CrearPuesto(nuevoPuesto);
	}
}
