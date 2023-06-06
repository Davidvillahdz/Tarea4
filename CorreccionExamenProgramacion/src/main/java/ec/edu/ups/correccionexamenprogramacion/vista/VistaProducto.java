/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.vista;

import ec.edu.ups.correccionexamenprogramacion.modelo.Producto;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaProducto {
  private Scanner entrada;
    public VistaProducto(){
        entrada = new Scanner(System.in);  
    }
    public Producto AgregarProducto(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos del producto");
        int codigo = entrada.nextInt();
        String nombre = entrada.next();
        String descripcion = entrada.next();
        return new Producto(codigo, nombre, descripcion, codigo);
    }
    public Producto ActualizarProducto(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del producto a actualizar");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese los nuevos datos del producto ");
        String nombre = entrada.next();
        String apellido = entrada.next();
        return new Producto(codigo, nombre, apellido, codigo);
    }
    public Producto EliminarProducto(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa la cedula del producto que quiere eliminar");
        int codigo = entrada.nextInt();
        return new Producto(codigo, null, null, codigo);
    }
    public int BuscarProducto(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del producto a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    public void VerProducto(String Producto){
        System.out.println("Datos del productoe: " + Producto);
    }

    public void verProductos(List<Producto> listaproducto) {
        for (Producto producto : listaproducto) {
            System.out.println(" lista de productos:" + listaproducto);
        }
    }

    public void VerProducto(int codigo) {
        
    }

    public void VerProducto(List<Producto> listaProductos) {
        
    }
      
}
