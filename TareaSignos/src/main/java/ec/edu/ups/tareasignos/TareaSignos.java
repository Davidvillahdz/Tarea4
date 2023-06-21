/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.tareasignos;

import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TareaSignos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cadena de símbolos: ");
        String cadena = scanner.nextLine();

        boolean simbolosValidos = validarSimbolos(cadena);

        if (simbolosValidos) {
            System.out.println("Los símbolos son válidos.");
        } else {
            System.out.println("Los símbolos NO son válidos.");
        }

        scanner.close();
    }

    public static boolean validarSimbolos(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (char c : cadena.toCharArray()) {
            if (esSimboloEntrada(c)) {
                pila.push(c);
            } else if (esSimboloSalida(c)) {
                if (pila.isEmpty()) {
                    return false;
                }

                char simboloEntrada = obtenerSimboloEntrada(c);
                char top = pila.pop();

                if (top != simboloEntrada) {
                    return false;
                }
            } else if (c == '.') {
                break;
            }
        }

        return pila.isEmpty();
    }

    public static boolean esSimboloEntrada(char c) {
        return c == '{' || c == '[' || c == '(';
    }

    public static boolean esSimboloSalida(char c) {
        return c == '}' || c == ']' || c == ')';
    }

    public static char obtenerSimboloEntrada(char c) {
        switch (c) {
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
            default:
                return '\0'; // Caracter nulo para casos inválidos
        }
    }
}


