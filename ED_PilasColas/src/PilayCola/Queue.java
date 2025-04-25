/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilayCola;

/**
 *
 * @author Obed
 */
public class Queue<T> {

    private LinkedList<T> lista;
    private int size;

    public Queue() {
        lista = new LinkedList<>();
        this.size = 0;
    }

    public void enqueue(T val) {
        lista.addLast(val);
        size++;
    }

    public T dequeue() {
        if (lista.isEmpty()) {
            throw new RuntimeException("La cola esta vacia.");
        }
        Node<T> p = lista.getHead();
        T val = p.getVal();
        lista.deletePos(0);
        size--;
        return val;
    }

    public T peek() {
        if (lista.isEmpty()) {
            throw new RuntimeException("La cola esta vacia.");
        }
        return lista.getPos(0);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size != 0);
    }

    public void clear() {
        lista.clear();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("[");
        Node<T> p = lista.getHead();
        while (p != null) {
            System.out.print(p.getVal());
            if (p.getNext() != null) {
                System.out.print(", ");
            }
            p = p.getNext();
        }
        System.out.println("]");
    }

}
