/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajoenclase3.controlador;

import ec.edu.ups.trabajoenclase3.vista.Contacto;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class Agenda<T, U> {

    private LinkedList<Contacto<T, U>> contactos;

    public Agenda() {
        contactos = new LinkedList<>();
    }

    public void agregar(Contacto<T,U>contacto) {
        contactos.add(contacto);

    }
    public Contacto<T,U> buscar(T nombre){
            for(Contacto<T,U> contacto: contactos){
                 if(contacto.getNombre().equals(nombre)){
                     return contacto;
                 }
            }return null;
    }
    public void eliminar(T name){
        Contacto<T,U> contacto = buscar(name);
        if(contacto !=null){
            contactos.remove(contacto);
        }
        
    }

}
