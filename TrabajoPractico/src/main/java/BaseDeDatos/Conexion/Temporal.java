package BaseDeDatos.Conexion;

import java.util.ArrayList;

import jakarta.persistence.*;

import Logica.entidades.Competencia;
import Logica.entidades.Puesto;
import Logica.enumeraciones.TipoCompetencia;
import Logica.gestores.GestorCompetencia;
import Logica.gestores.GestorPuesto;
import Logica.relaciones.PonderacionCompetencia;

public class Temporal {
	public static EntityManager entity;
	public static void programa() {
				try {
					entity = JPA.getEntityManagerFactory().createEntityManager();
					GestorPuesto g = new GestorPuesto();
					GestorCompetencia g2 = new GestorCompetencia();
					Puesto p;
					Competencia c = new Competencia(321, "SoyUnaCompetencia", "SoyUnNombre", TipoCompetencia.Tecnica);
					PonderacionCompetencia b = new PonderacionCompetencia(10, c);
					ArrayList<PonderacionCompetencia> a = new ArrayList<PonderacionCompetencia>();
					
					g2.CrearCompetencia(c);
					a.add(b);
					p = new Puesto(1234, "SoyUnPuesto", "soyUnaEmpresa", "soyUnNombre", null);
					//p.setPonderaciones(a);
					g.CrearPuesto(p);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	}

