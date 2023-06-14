/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.tareaenclase;

/**
 *
 * @author Usuario
 */
public class TareaEnClase {

    public static void main(String[] args) {
        System.out.println("Colores y pilas implementacion generica");
        //Instaciar obejtos

        ColaTarea<String> colaTarea = new ColaTarea<>();
        ColaTarea<Integer> colaTareaInt = new ColaTarea<>();
        ColaTarea<int[]> colaTareaArregloEntero = new ColaTarea<>();
        ColaTarea<String[]> colaTareaArregloString = new ColaTarea<>();

        PilaTarea<Integer> pilaTarea = new PilaTarea<>();
        PilaTarea<ColaTarea> pilaTareaArreglo = new PilaTarea<>();
        //Ingreso de datos
        colaTarea.agregrarTarea(new Tarea(1, "Tarea1"));
        colaTarea.agregrarTarea(new Tarea(2, "Tarea2"));
        colaTarea.agregrarTarea(new Tarea(3, "Tarea3"));
        colaTarea.agregrarTarea(new Tarea(4, "Tarea4"));
        

        //Ingresar(Integer)                                                                                                         
        pilaTarea.agregarTarea(new Tarea(5, 5));
        pilaTarea.agregarTarea(new Tarea(6, 6));
        pilaTarea.agregarTarea(new Tarea(7, 7));
        
        Tarea<int[]>t2 = new Tarea(8, new int[]{212,21});
        colaTareaArregloEntero.agregrarTarea(t2);
        colaTareaArregloEntero.agregrarTarea(new Tarea(9, new int[]{21,21}));

        while (!colaTarea.estaVacia()) {
            Tarea<String> TareaProcesada = colaTarea.procesarTarea();

            System.out.println("Procesando tarea de la cola \n\t Sale-->" + TareaProcesada.getId() + "-" + TareaProcesada.getAtributo());
        
        System.out.println("\n-----------");

        while (!pilaTarea.estaVacia()) {
            
            Tarea<Integer> tareaProcesada = pilaTarea.procesarTarea();
            System.out.println("Procesando tarea de la cola \n\t Sale-->" + tareaProcesada.getId() + "-" + tareaProcesada.getAtributo());
        }
        while(!colaTareaArregloEntero.estaVacia()){
            Tarea<int[]>tareaProcesada=colaTareaArregloEntero.procesarTarea();
            System.out.println("Procesando tarea de la cola \n\t Sale-->"+TareaProcesada.getId()+"-"+tareaProcesada.getAtributo());
        }
    }
        
}
}
