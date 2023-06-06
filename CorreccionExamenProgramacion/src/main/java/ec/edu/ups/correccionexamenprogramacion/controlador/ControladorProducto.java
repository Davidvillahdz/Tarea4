/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.controlador;

import ec.edu.ups.correccionexamenprogramacion.idao.IProductoDAO;
import ec.edu.ups.correccionexamenprogramacion.modelo.Producto;
import ec.edu.ups.correccionexamenprogramacion.vista.VistaProducto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorProducto {
    private VistaProducto vistaProducto;
    
    private Producto producto;
    
    private IProductoDAO productoDAO;
    
     public ControladorProducto(VistaProducto vistaProducto, Producto producto, IProductoDAO productoDAO) {
        this.vistaProducto = vistaProducto;
        this.producto = producto;
        this.productoDAO = productoDAO;
    }

    public ControladorProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void registrar() {
        producto = vistaProducto.AgregarProducto();
        productoDAO.create(producto);
    }
    public void verProducto() {
        int codigo = vistaProducto.BuscarProducto();
        producto = productoDAO.read(codigo);
        vistaProducto.VerProducto(codigo);
    }
    public void actualizar() {
        producto = vistaProducto.ActualizarProducto();
        productoDAO.update(producto);
    }
    public void eliminar() {
        producto = vistaProducto.EliminarProducto();
        productoDAO.delete(producto);
    }
    public void verClientes() {
        List<Producto> listaProductos;
        listaProductos = productoDAO.findAll();
        vistaProducto.VerProducto(listaProductos);
    }
}
