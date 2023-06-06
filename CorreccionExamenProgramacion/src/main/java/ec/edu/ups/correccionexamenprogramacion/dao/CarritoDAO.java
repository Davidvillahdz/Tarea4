/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.dao;

import ec.edu.ups.correccionexamenprogramacion.idao.ICarritoDAO;
import ec.edu.ups.correccionexamenprogramacion.modelo.Carrito;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class CarritoDAO implements ICarritoDAO {
    private Map<LocalDateTime, Carrito> carritos;
    
    public CarritoDAO() {
        carritos = new HashMap<>();
    }
    
    @Override
    public void crearCarrito(Carrito carrito) {
        carritos.put(carrito.getFechaHora(), carrito);
    }
    
    @Override
    public Carrito obtenerCarrito(LocalDateTime fechaHora) {
        return carritos.get(fechaHora);
    }
    
    @Override
    public void actualizarCarrito(Carrito carrito) {
        carritos.put(carrito.getFechaHora(), carrito);
    }
    
    @Override
    public void eliminarCarrito(LocalDateTime fechaHora) {
        carritos.remove(fechaHora);
    }

    @Override
    public void create(Carrito carrito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Carrito read(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Carrito carrito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Carrito carrito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Carrito> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
