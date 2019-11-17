package com.trifulcas.springhibernate.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.trifulcas.springhibernate.dao.IAgendaDAO;
import com.trifulcas.springhibernate.entity.Contacto;

@Service
public class AgendaService implements IAgendaService {
	
	@Autowired
	private IAgendaDAO agendaDAO;
	
	@Override
	@Transactional
	public List<Contacto> getContactos() {
		return agendaDAO.getContactos();
	}

	@Override
	@Transactional
	public void saveContacto(Contacto contacto) {
		agendaDAO.saveContacto(contacto);
	}

	@Override
	@Transactional
	public Contacto getContacto(int idcontacto) {
		return agendaDAO.getContacto(idcontacto);
	}

	@Override
	@Transactional
	public void deleteContacto(Contacto contacto) {
		agendaDAO.deleteContacto(contacto);
	}

}
