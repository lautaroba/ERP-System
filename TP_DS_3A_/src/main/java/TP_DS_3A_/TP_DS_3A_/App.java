package TP_DS_3A_.TP_DS_3A_;

import java.awt.EventQueue;
import java.util.ArrayList;
import DTO.PuestoDTO;
import Entidades.Competencia;
import Enumeraciones.TipoCompetencia;
import Gestores.GestorCompetencia;
import Gestores.GestorPuesto;
import Relaciones.PonderacionCompetencia;
import jakarta.persistence.EntityManager;

public class App {

	public static EntityManager entityManager;
	
		public static void main(String[] args) {
	
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
						GestorPuesto g = new GestorPuesto();
						GestorCompetencia g2 = new GestorCompetencia();
						PuestoDTO p = new PuestoDTO();
						Competencia c = new Competencia(321, "SoyUnaCompetencia", "SoyUnNombre", TipoCompetencia.Tecnica);
						PonderacionCompetencia b = new PonderacionCompetencia(10, c);
						ArrayList<PonderacionCompetencia> a = new ArrayList<PonderacionCompetencia>();
						
						g2.CrearCompetencia(c);
						
						a.add(b);
						p.setCodigo(12345);
						p.setDescripcion("SoyUnPuesto");
						p.setEmpresa("soyUnaEmpresa");
						p.setNombre("soyUnNombre");
						//p.setPonderaciones(a);
						g.CrearPuesto(p);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

}
