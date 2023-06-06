/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.controlador;

import ec.edu.ups.correccionexamenprogramacion.idao.ICarritoDAO;
import ec.edu.ups.correccionexamenprogramacion.modelo.Carrito;
import ec.edu.ups.correccionexamenprogramacion.vista.VistaCarrito;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorCarrito {
    private VistaCarrito vistaCarrito;
    
    private Carrito carrito;
    
    private ICarritoDAO carritoDAO;
    public Carrito obtener;

    public ControladorCarrito(VistaCarrito vistaCarrito, Carrito carrito, ICarritoDAO carritoDAO) {
        this.vistaCarrito = vistaCarrito;
        this.carrito = carrito;
        this.carritoDAO = carritoDAO;
    }

    public ControladorCarrito() {
        
    }
    
    public void registrar() {
        carrito = vistaCarrito.AgregarCarrito();
        carritoDAO.create(carrito);
    }
    public void verCarrito() {
        int codigo = vistaCarrito.BuscarCarrito();
        carrito = carritoDAO.read(codigo);
        vistaCarrito.VerCarrito(codigo);
    }
    public void actualizar() {
        carrito = vistaCarrito.ActualizarCarrito();
        carritoDAO.update(carrito);
    }
    public void eliminar() {
        carrito = vistaCarrito.EliminarCarrito();
        carritoDAO.delete(carrito);
    }
    public void verClientes() {
        List<Carrito> listaCarritos;
        listaCarritos = carritoDAO.findAll();
        vistaCarrito.VerCarrito(listaCarritos);
    }

    public void agregarCliente(Carrito carrito1) {
       
    }
}
