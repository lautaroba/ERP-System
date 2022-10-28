package Gestores;

import DTO.PuestoDTO;
import Entidades.Puesto;
import Base_De_Datos.PuestoMySQLDao;

public class GestorPuesto{

	public void CrearPuesto(PuestoDTO p) {
		//deberia buscarlo
		Puesto nuevoPuesto = new Puesto(p.getCodigo(), p.getNombre(), p.getDescripcion(), p.getEmpresa(), p.getPonderaciones());
		PuestoMySQLDao.CrearPuesto(nuevoPuesto);
	}
	public void ModificarPuesto(PuestoDTO p) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarPuesto(PuestoDTO p) {
		// TODO Auto-generated method stub
		
	}

	public Puesto BuscarPuesto(PuestoDTO p) {
		
		return null;
	}


}
