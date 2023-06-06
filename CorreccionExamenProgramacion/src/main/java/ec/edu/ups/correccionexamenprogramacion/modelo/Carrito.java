/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.modelo;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Carrito {
    private LocalDateTime fechaHora;
    private double subtotal;
    private double iva;
    private double total;
    private Cliente cliente;
    private List<Producto> productos;

    public Carrito(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
        
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
    public void calcularTotales() {
        subtotal = 0.0;
        
        for (Producto producto : productos) {
            subtotal += producto.getPrecio() * producto.getCantidad();
        }
        
        iva = subtotal * 0.12; 
        total = subtotal + iva;
        
    }

    @Override
    public String toString() {
        return "Carrito{" + "fechaHora=" + fechaHora + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + ", productos=" + productos + '}';
    }
    
}
