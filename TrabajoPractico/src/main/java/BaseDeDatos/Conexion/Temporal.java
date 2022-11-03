package BaseDeDatos.Conexion;

import javax.persistence.*;
import Logica.entidades.Puesto;
import Logica.gestores.GestorPuesto;

public class Temporal {
	public static EntityManager entity;
	public static void programa() {
				try {
					
					System.out.println("llege aca");
					Puesto p = new Puesto(123, "asd", "asdasd", "asddda", null);
					System.out.println("llege aca");
					entity = JPA.getEntityManagerFactory().createEntityManager();
					
					
					entity.getTransaction().begin();
					entity.persist(p);
					entity.getTransaction().commit();
					
					//GestorPuesto gp = new GestorPuesto();
					//gp.CrearPuesto(new Puesto(1, "puesto", "empresa", "nombre", null));
					
					System.out.println("aca no :c");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	}

