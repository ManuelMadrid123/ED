/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author alumno
 */
public class ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p = new Persona("626350062");
        System.out.println("Número de teléfono: "+p.getNumeroDeTelefono());
        
        Persona p2 = new Persona("626350063");
        System.out.println("Número de teléfono: "+p2.getNumeroDeTelefono());
    }
    
}
