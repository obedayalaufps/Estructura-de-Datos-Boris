/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PilayCola;

/**
 *
 * @author Obed
 */
public class MainCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q = new Queue();
        
        //enqueue()
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);
        q.print();
        
        //dequeue()
        q.dequeue();
        q.print();
        
        //peek()
        System.out.println("Valor al inicio de la cola: "+q);
        
    } 
}
