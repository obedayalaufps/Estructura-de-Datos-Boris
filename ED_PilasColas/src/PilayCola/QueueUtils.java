/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilayCola;

/**
 *
 * @author Obed
 */
public class QueueUtils {

    public boolean sonIguales(Queue q1, Queue q2) {
        while (!q1.isEmpty() || !q2.isEmpty()) {
            if (!q1.dequeue().equals(q2.dequeue())) {
                return false;
            }
            if (q1.isEmpty() || q2.isEmpty()) {
                return false;
            }
        }
        return true;
    }
    
    

}
