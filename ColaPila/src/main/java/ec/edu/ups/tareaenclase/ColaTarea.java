/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.tareaenclase;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Usuario
 */
public class ColaTarea<T> {
    private Queue<Tarea<T>> colaTarea;
    public ColaTarea(){
        colaTarea = new LinkedList<>();
    }
    public void agregrarTarea(Tarea<T>tarea){
        colaTarea.offer(tarea);
    }
    public Tarea<T> procesarTarea(){
        Tarea<T> tareaProcesada = colaTarea.poll();
        return tareaProcesada;
    }
    public boolean estaVacia(){
        return colaTarea.isEmpty();
    }
}

