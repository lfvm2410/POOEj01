/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;

/**
 *
 * @author luis_
 */
public class PersonaService {
    
    public void getPersona(Persona persona){
        System.out.println("Id: " + persona.getId());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
    
}
