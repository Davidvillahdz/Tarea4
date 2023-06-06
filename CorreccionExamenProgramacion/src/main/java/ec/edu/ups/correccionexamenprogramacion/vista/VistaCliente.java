/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.vista;

import ec.edu.ups.correccionexamenprogramacion.modelo.Cliente;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaCliente {
    private Scanner entrada;
    public VistaCliente(){
        entrada = new Scanner(System.in);  
    }
    public Cliente AgregarCliente(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos del cliente");
        String cedula = entrada.next();
        String nombre = entrada.next();
        String apellido = entrada.next();
        return new Cliente(cedula, nombre, apellido, apellido, apellido);
    }
    public Cliente ActualizarCliente(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa la cedula del cliente a actualizar");
        String cedula = entrada.next();
        System.out.println("Ingrese los nuevos datos del cliente ");
        String nombre = entrada.next();
        String apellido = entrada.next();
        return new Cliente(cedula, nombre, apellido, apellido, apellido);
    }
    public Cliente EliminarCliente(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa la cedula del cliente que quiere eliminar");
        String cedula = entrada.next();
        return new Cliente(cedula, null, null, null, null);
    }
    public String BuscarCliente(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa la cedula del cliente a buscar");
        String cedula = entrada.next();
        return cedula;
    }
    public void VerCliente(String Cliente){
        System.out.println("Datos del Cliente: " + Cliente);
    }

    public void VerCliente(List<Cliente> listaClientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
