package InterfacesDAO;

import DTO.PuestoDTO;
import Entidades.Puesto;

public interface PuestoDao {
	
	public void CrearPuesto(Puesto p);
	public void ModificarPuesto(PuestoDTO p);
	public void EliminarPuesto(PuestoDTO p);
	public Puesto BuscarPuesto(PuestoDTO p);
	//public void BuscarOrdenDeMerito();
	
}
