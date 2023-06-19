/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajoenclase3.vista;

/**
 *
 * @author Usuario
 */
public class Contacto<T, U> {

    private T nombre;
    private U telefono;

    public Contacto(T nombre, U telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public U getTelefono() {
        return telefono;
    }

    public void setTelefono(U telefono) {
        this.telefono = telefono;
    }

}
