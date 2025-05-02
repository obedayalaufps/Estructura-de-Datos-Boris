/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PosfijoInfijo;

import PilayCola.Stack;

/**
 *
 * @author Obed
 */
public class Expresion {

    String cadena;

    public Expresion() {
    }

    public Expresion(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String convertirInfijaAPosfija(String expresion) {
        Stack<Character> pila = new Stack<>();
        char[] ex = expresion.toCharArray();
        String posfija = "";

        for (Character c : ex) {
            if (!isOperador(c) && !isAgrupador(c)) {
                posfija += c;
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (pila.isFull() && pila.peek() != '(') {
                    posfija += pila.pop();
                }
                pila.pop();
            } else if (isOperador(c)) {
                while (pila.isFull() && isOperador(pila.peek()) && prioridad(c) <= prioridad(pila.peek())) {
                    posfija += pila.pop();
                }
                pila.push(c);
            }
        }
        while (pila.isFull()) {
            posfija += pila.pop();
        }
        return posfija;
    }

    public float evaluarPosfija(String expresionPosfija) {
        Stack<Float> pila = new Stack<>();
        char[] exp = expresionPosfija.toCharArray();
        for (char c : exp) {
            if (!isOperador(c)) {
                pila.push((float)Character.getNumericValue(c));
            } else if (isOperador(c)){
                float b = pila.pop();
                float a = pila.pop();
                switch (c) {
                    case '+':
                        pila.push(a + b);
                        break;
                    case '-':
                        pila.push(a - b);
                        break;
                    case '*':
                        pila.push(a * b);
                        break;
                    case '/':
                        pila.push(a / b);
                        break;
                    case '^':
                        pila.push((float) Math.pow(a, b));
                        break;
                }
            }
        }
        return pila.pop();
    }

    public int prioridad(char c) {
        if (c == '+' || c == '-') {
            return 1;
        }
        if (c == '*' || c == '/') {
            return 2;
        }
        if (c == '^') {
            return 3;
        }
        return -1;
    }

    public boolean isOperador(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    public boolean isAgrupador(char c) {
        return (c == '(' || c == ')');
    }
}
