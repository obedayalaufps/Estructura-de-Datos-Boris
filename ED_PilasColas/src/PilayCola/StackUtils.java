/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilayCola;

/**
 *
 * @author Obed
 */
public class StackUtils {

    public boolean isBalanceado(String ec) {
        Stack<Character> pila = new Stack<>();
        char[] arec = ec.toCharArray();
        for (char c : arec) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) {
                    return false;
                }
                char d = pila.pop();
                if (!concuerda(d, c)) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public boolean concuerda(char a, char b) {
        return (a == '(' && b == ')'
                || a == '{' && b == '}'
                || a == '[' && b == ']');
    }

    public int obtenerNumero(String ec) {
        Stack<Character> pila = new Stack<>();
        boolean dentro = false;
        String contenido = "";
        for (char c : ec.toCharArray()) {
            if (c == '(') {
                pila.push(c);
                dentro = true;
                contenido = "";
            } else if (c == ')' && dentro && !pila.isEmpty()) {
                pila.pop();
                dentro = false;
                if (contenido.trim().matches("\\d+")) {
                    return Integer.parseInt(contenido);
                }
            } else if (dentro) {
                contenido += c;
            }
        }
        return -1;
    }

    public boolean isPalindromo(String palabra) {
        Stack<Character> pila = new Stack<>();
        char[] letras = palabra.toCharArray();
        for (char l : letras) {
            pila.push(l);
        }
        for (char l : letras) {
            if (l != pila.pop()) {
                return false;
            }
        }
        return true;
    }

}
