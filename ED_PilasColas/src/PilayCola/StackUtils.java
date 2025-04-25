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
            }
            else if (c == ')' || c == '}' || c == ']'){
                if (pila.isEmpty()) {
                    return false;
                }
                char d = pila.pop();
                if (!concuerda(d,c)) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
    
    public boolean concuerda(char a, char b){
        return (a == '(' && b == ')' ||
                a == '{' && b == '}' ||
                a == '[' && b == ']');
    }
    
        
}
