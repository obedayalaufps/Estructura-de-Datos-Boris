/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PilayCola;

/**
 *
 * @author Obed
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack s = new Stack();
        
        //push()
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);
        s.print();
        
        //pop()
        s.pop();
        s.print();
        
        //peek
        System.out.println("Valor en la cima de la pila: "+s.peek());
        
        StackUtils utils = new StackUtils();
        
        String expresion = "{()}{}()";
        System.out.println(utils.isBalanceado(expresion));
        
        String palabra = "alila";
        if (utils.isPalindromo(palabra)) {
            System.out.println("Es palindromo.");
        }
        else{
            System.out.println("No es palindromo.");
        }
        
    }
    
}
