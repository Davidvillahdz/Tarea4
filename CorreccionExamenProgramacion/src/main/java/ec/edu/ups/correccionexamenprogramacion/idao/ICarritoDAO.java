/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.idao;

import ec.edu.ups.correccionexamenprogramacion.modelo.Carrito;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ICarritoDAO {
    public void crearCarrito(Carrito carrito);
    public Carrito obtenerCarrito(LocalDateTime fechaHora);
    public void actualizarCarrito(Carrito carrito);
    public void eliminarCarrito(LocalDateTime fechaHora);

    public void create(Carrito carrito);

    public Carrito read(int codigo);

    public void update(Carrito carrito);

    public void delete(Carrito carrito);

    public List<Carrito> findAll();
}
