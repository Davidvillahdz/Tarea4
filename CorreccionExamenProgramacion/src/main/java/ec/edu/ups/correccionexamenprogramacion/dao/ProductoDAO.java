/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.correccionexamenprogramacion.dao;

import ec.edu.ups.correccionexamenprogramacion.idao.IProductoDAO;
import ec.edu.ups.correccionexamenprogramacion.modelo.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProductoDAO implements IProductoDAO{
    private List<Producto> listaProductos;
    
    public ProductoDAO(){
        listaProductos = new ArrayList<>();
    }

    public ProductoDAO(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public void create(Producto producto) {
        listaProductos.add(producto);
    }

    @Override
    public Producto read(int codigo) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo()== codigo) {
                return producto;
            }       
        }
        return null;
    }

    @Override
    public void update(Producto producto) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            if (p.getCodigo() == producto.getCodigo()) {
                listaProductos.set(i, producto);
                break;
            }
        }
    }

    @Override
    public void delete(Producto producto) {
        Iterator<Producto> it = listaProductos.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            if (p.getCodigo() == producto.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Producto> findAll() {
        return listaProductos;
        
    }
    
}
