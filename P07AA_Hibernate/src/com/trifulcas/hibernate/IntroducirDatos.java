package com.trifulcas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.trifulcas.hibernate.entidades.Alumno;
import com.trifulcas.hibernate.entidades.Profesor;
import com.trifulcas.hibernate.entidades.Modulo;

public class IntroducirDatos {
	
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
			
			Profesor prof1 = new Profesor("36971116L","Rafael Costa","rcosta@hotmail.com");
			Profesor prof2 = new Profesor("38750129M","Toni Saseras","tsaseras@gmail.com");
			
			session.save(prof1);
			session.save(prof2);
			
			Modulo mod1 = new Modulo("Web Security");
			Modulo mod2 = new Modulo("Java/Spring");
			
			mod1.setProfesor(prof1);
			mod2.setProfesor(prof2);
			
			session.save(mod1);
			session.save(mod2);
						
			Alumno alu1 = new Alumno("Jordi Jou","jj99@gmail.com");
			Alumno alu2 = new Alumno("Pablo Gutierrez","pguti@pnet.cat");
			Alumno alu3 = new Alumno("Dolors Aloy","dolaloy@hotmail.com");
			
			alu1.addModulo(mod1);
			alu2.addModulo(mod1);
			alu3.addModulo(mod2);
			
			session.save(alu1);
			session.save(alu2);
			session.save(alu3);
			
			// commit de la transacción
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
		
	}
	
}
