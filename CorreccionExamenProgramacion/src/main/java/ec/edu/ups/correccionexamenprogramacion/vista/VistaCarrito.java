/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.vista;

import ec.edu.ups.correccionexamenprogramacion.modelo.Carrito;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaCarrito {
    private Scanner entrada;
    public VistaCarrito(){
        entrada = new Scanner(System.in);  
    }
    public Carrito AgregarCarrito(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos del carrito");
        int codigo = entrada.nextInt();
        return new Carrito(LocalDateTime.MAX);
    }
    public Carrito ActualizarCarrito(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del carrito a actualizar");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese los nuevos datos del carrito ");
        String nombre = entrada.next();
        String apellido = entrada.next();
        return new Carrito(LocalDateTime.MAX);
    }
    public Carrito EliminarCarrito(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del carrito que quiere eliminar");
        int codigo = entrada.nextInt();
        return new Carrito(null);
    }
    public int BuscarCarrito(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del carrito a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    public void VerCarrito(String Carrito){
        System.out.println("Datos del carrito: " + Carrito);
    }

    public void verCarrito(List<Carrito> listacarrito) {
        for (Carrito carrito : listacarrito) {
            System.out.println(" lista de productos:" + listacarrito);
        }
    }

    public void VerCarrito(int codigo) {
        
    }

    public void VerCarrito(List<Carrito> listaCarrito) {
        
    }
  
}
