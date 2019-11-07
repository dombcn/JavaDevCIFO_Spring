package com.trifulcas.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.trifulcas.hibernate.entidades.Profesor;
import com.trifulcas.hibernate.entidades.Alumno;
import com.trifulcas.hibernate.entidades.Modulo;

public class ConsultarDatos {
	
	public static void main(String[] args) {
		
		// Crear la configuración cogíendola del xml y añadiendo la clase Categorias
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Alumno.class);
		configuration.addAnnotatedClass(Profesor.class);
		configuration.addAnnotatedClass(Modulo.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

		// Crear la factoría de sesiones
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		// Crear la sesión
		Session session = factory.getCurrentSession();
		
		try {
			// Iniciar transacción
			session.beginTransaction();
			
			// Leer Profesores
			@SuppressWarnings("unchecked")
			List<Profesor> listaProf = session.createQuery("from Profesor").getResultList();
			for (Profesor p : listaProf) {
				System.out.println(p);
			}
			
			// Leer Alumnos
			@SuppressWarnings("unchecked")
			List<Alumno> listaAlum = session.createQuery("from Alumno").getResultList();
			for (Alumno a : listaAlum) {
				System.out.println(a);
			}
			
			// Leer Modulos
			@SuppressWarnings("unchecked")
			List<Modulo> listaMod = session.createQuery("from Modulo").getResultList();
			for (Modulo m : listaMod) {
				System.out.println(m);
			}
						
			// commit de la transacción
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
		
	}
	
}

