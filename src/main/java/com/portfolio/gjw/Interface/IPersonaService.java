package com.portfolio.gjw.Interface;

import com.portfolio.gjw.Entity.Persona;
import java.util.List;


public interface IPersonaService {
     //listar Personas
    public List<Persona> getPersona();
    
    //guardar una persona 
    public void savePersona (Persona persona);
    
    //eliminar una persona
    public void deletePersona (Long id);
    
    //buscar persona por ID
    public Persona findPersona(Long id);
    
}
