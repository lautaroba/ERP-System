package BaseDeDatos.MySQL;

import BaseDeDatos.Conexion.Temporal;
import Logica.entidades.Puesto;

public class PuestoMySQL{
	
	public static void CrearPuesto(Puesto p) {
		Temporal.entity.getTransaction().begin();
		Temporal.entity.persist(p);
		Temporal.entity.getTransaction().commit();
	}

	public static void ModificarPuesto(Puesto p) {
		// TODO Auto-generated method stub
		
	}

	public static void EliminarPuesto(Puesto p) {
		// TODO Auto-generated method stub
		
	}

	public Puesto BuscarPuesto(Puesto p) {
		// TODO Auto-generated method stub
		return null;
	}
}
