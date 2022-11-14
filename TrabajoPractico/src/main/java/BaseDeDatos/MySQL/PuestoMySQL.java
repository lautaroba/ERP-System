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

		Temporal.entity.getTransaction().begin();
		Temporal.entity.merge(p);
		Temporal.entity.getTransaction().commit();
		
	}

	public static void EliminarPuesto(Puesto p) {
		// TODO Auto-generated method stub
		
	}

	public static Puesto BuscarPuesto(Puesto p) {
		return Temporal.entity.find(Puesto.class, p.getCodigo());
	}
}
