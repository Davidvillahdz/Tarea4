/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.idao;

import ec.edu.ups.correccionexamenprogramacion.modelo.Cliente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IClienteDAO {
    public void create(Cliente cliente);
    public Cliente read(String cedula);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);   
    public List<Cliente> findAll();


}
