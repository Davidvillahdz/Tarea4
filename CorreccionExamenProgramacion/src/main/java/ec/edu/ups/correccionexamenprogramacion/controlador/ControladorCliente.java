/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.controlador;

import ec.edu.ups.correccionexamenprogramacion.idao.IClienteDAO;
import ec.edu.ups.correccionexamenprogramacion.modelo.Cliente;
import ec.edu.ups.correccionexamenprogramacion.vista.VistaCliente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorCliente {
    private VistaCliente vistaCliente;
    
    private Cliente cliente;
    
    private IClienteDAO clienteDAO;
    public Cliente obtener;

    public ControladorCliente(VistaCliente vistaCliente, Cliente cliente, IClienteDAO clienteDAO) {
        this.vistaCliente = vistaCliente;
        this.cliente = cliente;
        this.clienteDAO = clienteDAO;
    }

    public ControladorCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void registrar() {
        cliente = vistaCliente.AgregarCliente();
        clienteDAO.create(cliente);
    }
    public void verCliente() {
        String cedula = vistaCliente.BuscarCliente();
        cliente = clienteDAO.read(cedula);
        vistaCliente.VerCliente(cedula);
    }
    public void actualizar() {
        cliente = vistaCliente.ActualizarCliente();
        clienteDAO.update(cliente);
    }
    public void eliminar() {
        cliente = vistaCliente.EliminarCliente();
        clienteDAO.delete(cliente);
    }
    public void verClientes() {
        List<Cliente> listaClientes;
        listaClientes = clienteDAO.findAll();
        vistaCliente.VerCliente(listaClientes);
    }

    public void agregarCliente(Cliente cliente1) {
       
    }
}
