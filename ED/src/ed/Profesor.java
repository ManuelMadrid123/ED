/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Profesor extends Persona {
    private String nombre;
    private int edad;
    ArrayList<Prestamo> prestamos;
    
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    
    
    public void printInformacionPersonal(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
        for(Prestamo p: prestamos){
            System.out.println(p);
        }
    }
}