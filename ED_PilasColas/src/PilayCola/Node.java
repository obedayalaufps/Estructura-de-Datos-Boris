/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilayCola;

/**
 *
 * @author Obed
 */
public class Node <T>{
    
    private Node<T> next;
    private T val;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
    
    
    
}
