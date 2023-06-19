/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.trabajoenclase3.vista;

import ec.edu.ups.trabajoenclase3.controlador.Agenda;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TrabajoEnClase3 {

    public static void main(String[] args) {
        Agenda<String,String> agenda = new Agenda<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while(opcion !=3){
            System.out.println("Menu");
             System.out.println("1. agregar contacto");
            System.out.println("2. eliminar Contacto");
            System.out.println("3. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
              switch (opcion) {
                case 1:
                    System.out.print("Introduzca el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduzca el telefono: ");
                    String telefono = scanner.nextLine();
                    Contacto<String, String> contacto = new Contacto<>(nombre, telefono);
                    agenda.agregar(contacto);
                    System.out.println("Contacto añadido");
                    break;
                case 2:
                    System.out.print("introduzca el nombre: ");
                    nombre = scanner.nextLine();
                    agenda.eliminar(nombre);
                    System.out.println("Contacto eliminado");
                    break;
                case 3:
                    System.out.println("salio, gracias por usar ");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }
        }
    }

