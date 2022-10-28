package Base_De_Datos;

import DTO.PuestoDTO;
import TP_DS_3A_.TP_DS_3A_.App;
import Entidades.Puesto;

public class PuestoMySQLDao {
	
	public static void CrearPuesto(Puesto p) {
		App.entityManager.getTransaction().begin();
		App.entityManager.persist(p);
		App.entityManager.getTransaction().commit();
	}
	public void ModificarPuesto(PuestoDTO p) {
		// TODO Auto-generated method stub

	}
	public void EliminarPuesto(PuestoDTO p) {
		// TODO Auto-generated method stub

	}
	public Puesto BuscarPuesto(PuestoDTO p) {
		return App.entityManager.find(Puesto.class, p.getCodigo());
	}

}
