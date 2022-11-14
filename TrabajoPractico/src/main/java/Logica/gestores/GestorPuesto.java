package Logica.gestores;

import BaseDeDatos.MySQL.PuestoMySQL;
import Logica.entidades.Puesto;

public class GestorPuesto{

	public void CrearPuesto(Puesto p) {
		
		if(PuestoMySQL.BuscarPuesto(p) == null) {
			Puesto nuevoPuesto = new Puesto(p.getCodigo(), p.getNombre(), p.getDescripcion(), p.getEmpresa(), p.getPonderaciones());
			PuestoMySQL.CrearPuesto(nuevoPuesto);
			}
		else {
			System.out.println("Puesto existente, intente nuevamente");
			}
		}
	
	public Puesto BuscarPuesto(Puesto p) {
		
		Puesto aux = PuestoMySQL.BuscarPuesto(p);
		
		if(aux == null) {
			System.out.println("Puesto existente, intente nuevamente");
			}
		else {
			return aux;
			}
		return null;
	}
	
	public void ModificarPuesto(Puesto p) {	
			PuestoMySQL.ModificarPuesto(p);
	}
	
}
