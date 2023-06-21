/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2.controlador;

import ec.edu.ups.practica2.modelo.HistorialTransacciones;
import ec.edu.ups.practica2.modelo.Inventario;
import ec.edu.ups.practica2.modelo.Producto;
import ec.edu.ups.practica2.modelo.Transaccion;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class ControladorTienda {

    private Inventario inventario;
    private HistorialTransacciones historialTransacciones;

    public ControladorTienda() {
        inventario = new Inventario();
        historialTransacciones = new HistorialTransacciones();
    }

    public void guardarProducto(String nombre, String codigo, double precio, int cantidad) {
        Producto producto = new Producto(nombre, codigo, precio, cantidad);
        inventario.guardarProducto(producto);
    }

    public void eliminarProducto(String codigo) {
        inventario.eliminarProducto(codigo);
    }

    public void venderProducto(String codigo, int cantidad) {
        Producto producto = inventario.findProduct(codigo);

        if (producto != null && producto.getCantidad() >= cantidad) {
            double total = producto.getPrecio() * cantidad;
            producto.setCantidad(producto.getCantidad() - cantidad);
            Transaccion transaccion = new Transaccion(producto, cantidad, total);
            historialTransacciones.GuardarTransaccion(transaccion);
        } else {
            System.out.println("Producto no encontrado o falta cantidad.");
        }
    }

    public List<Producto> getInventario() {
        return inventario.getProductos();
    }

    public Stack<Transaccion> getHistorialDeTransacciones() {
        return historialTransacciones.getTransacciones();
    }
}
