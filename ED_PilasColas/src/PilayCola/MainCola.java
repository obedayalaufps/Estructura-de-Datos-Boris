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
        Queue q1 = new Queue();
        Queue q2 = new Queue();
        
        //enqueue()
        q1.enqueue(2);
        q1.enqueue(4);
        q1.enqueue(6);
        q1.enqueue(8);
        q1.enqueue(10);
        q1.print();
        
        q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(6);
        q2.enqueue(8);
        q2.enqueue(10);
        q2.print();
        
        //dequeue()
        q1.dequeue();
        q1.print();
        
        //peek()
        System.out.println("Valor al inicio de la cola: "+q1);
        
        QueueUtils utils = new QueueUtils();
        System.out.println(utils.sonIguales(q1, q2));
        
    } 
}
