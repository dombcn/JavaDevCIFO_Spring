package com.trifulcas.springhibernate.service;

import java.util.List;
import com.trifulcas.springhibernate.entity.Contacto;

public interface IAgendaService {
	
      List<Contacto> getContactos();
      
      void saveContacto(Contacto contacto);
      
      Contacto getContacto(int idcontacto);
      
      void deleteContacto(Contacto contacto);
      
}
