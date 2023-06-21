/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2.vista;

import ec.edu.ups.practica2.controlador.ControladorTienda;
import ec.edu.ups.practica2.modelo.Producto;
import ec.edu.ups.practica2.modelo.Transaccion;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class VistaTienda {

    private ControladorTienda controlador;

    public VistaTienda(ControladorTienda controlador) {
        this.controlador = controlador;
    }

    public void mostrarInventario() {
        List<Producto> productos = controlador.getInventario();
        System.out.println("Inventario Actual:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " (" + producto.getCodigo() + "): " + producto.getCantidad());
        }
    }

    public void mostrarElHistorialDeTransacciones() {
        Stack<Transaccion> transacciones = controlador.getHistorialDeTransacciones();
        System.out.println("Historial de la transaccion:");
        for (Transaccion transaccion : transacciones) {
            System.out.println(transaccion.getProducto().getNombre() + " (" + transaccion.getProducto().getCodigo() + "): " + transaccion.getCantidad() + " Vendido por " + transaccion.getTotal());
        }
    }

    public void guardarProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el codigo del producto: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = scanner.nextInt();
        controlador.guardarProducto(nombre, codigo, precio, cantidad);
    }

    public void eliminarProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el codigo del producto: ");
        String codigo = scanner.nextLine();
        controlador.eliminarProducto(codigo);
    }

    public void venderProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el codigo: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        controlador.venderProducto(codigo, cantidad);
    }
}
