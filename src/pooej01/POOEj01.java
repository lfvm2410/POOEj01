/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Servicio.PersonaService;
import Entidad.Persona;

/**
 *
 * @author luis_
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona(115770173, "Luis Fernando", 28);
        PersonaService personaService = new PersonaService();
        personaService.getPersona(persona);
    }
    // Progreso actual, pagina #19
}
