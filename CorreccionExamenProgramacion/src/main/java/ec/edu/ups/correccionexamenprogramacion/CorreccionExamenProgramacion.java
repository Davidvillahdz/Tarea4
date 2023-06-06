/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.correccionexamenprogramacion;

import ec.edu.ups.correccionexamenprogramacion.controlador.ControladorCarrito;
import ec.edu.ups.correccionexamenprogramacion.controlador.ControladorCliente;
import ec.edu.ups.correccionexamenprogramacion.controlador.ControladorProducto;
import ec.edu.ups.correccionexamenprogramacion.modelo.Cliente;

/**
 *
 * @author Usuario
 */
public class CorreccionExamenProgramacion {

    public static void main(String[] args) {
        ControladorCliente controladorcliente1 = new ControladorCliente();
        ControladorProducto controladorproducto1 = new ControladorProducto();
        ControladorCarrito carritoController = new ControladorCarrito();
        
        // Pruebas CRUD de clientes
        Cliente cliente1 = new Cliente("123456789", "Juan", "Perez", "Calle 123", "1234567890");
        controladorcliente1.agregarCliente(cliente1);
        
        Cliente verCliente = controladorcliente1.obtener;
    }
    
}
