package com.trifulcas.springhibernate.dao;

import java.util.List;
import com.trifulcas.springhibernate.entity.Contacto;

public interface IAgendaDAO {
	
      List<Contacto> getContactos();
      
      void saveContacto(Contacto contacto);
      
      Contacto getContacto(int idcontacto);
      
      void deleteContacto(Contacto contacto);
      
}
