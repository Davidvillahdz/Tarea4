/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2.modelo;

import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class HistorialTransacciones {

    private Stack<Transaccion> transacciones;

    public HistorialTransacciones() {
        transacciones = new Stack<>();
    }

    public void GuardarTransaccion(Transaccion transaccion) {
        transacciones.push(transaccion);
    }

    public Stack<Transaccion> getTransacciones() {
        return transacciones;
    }
}
