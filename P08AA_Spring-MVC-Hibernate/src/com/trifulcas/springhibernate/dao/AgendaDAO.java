package com.trifulcas.springhibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.trifulcas.springhibernate.entity.Contacto;

@Repository
public class AgendaDAO implements IAgendaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Contacto> getContactos() {
		Session miSesion=sessionFactory.getCurrentSession();
		List<Contacto> contactos=miSesion.createQuery("from Contacto",Contacto.class).list();
		return contactos;
	}

	@Override
	public void saveContacto(Contacto contacto) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.saveOrUpdate(contacto);
	}

	@Override
	public Contacto getContacto(int idcontacto) {
		Session miSesion=sessionFactory.getCurrentSession();
		return miSesion.get(Contacto.class,idcontacto);
	}

	@Override
	public void deleteContacto(Contacto contacto) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.delete(contacto);
	}
	
}
