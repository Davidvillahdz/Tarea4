/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.tareaenclase;

import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class PilaTarea<T> {
    private Stack<Tarea<T>> pilaTareas;

    public PilaTarea() {
        this.pilaTareas = pilaTareas;
    }
    
   public void agregarTarea(Tarea<T> tarea){
       pilaTareas.push(tarea);
   }
   public Tarea<T> procesarTarea(){
       return pilaTareas.pop();
   }
    public boolean estaVacia(){
        return pilaTareas.empty();
    }
}
