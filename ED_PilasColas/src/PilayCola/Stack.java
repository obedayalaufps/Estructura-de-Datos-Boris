/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilayCola;

/**
 *
 * @author Obed
 */
public class Stack<T> {

    private LinkedList<T> lista;
    private int size;

    public Stack() {
        lista = new LinkedList<>();
        this.size = 0;
    }

    public void push(T val) {
        lista.addFirst(val);
        size++;
    }

    public T pop() {
        if (lista.isEmpty()) {
            throw new RuntimeException("La pila esta vacia.");
        }
        Node<T> p = lista.getHead();
        T val = p.getVal();
        lista.deletePos(0);
        size--;
        return val;
    }

    public T peek() {
        if (lista.isEmpty()) {
            throw new RuntimeException("La pila esta vacia.");
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
            System.out.println("Pila vacía");
            return;
        }
        Node<T> p = lista.getHead();
        while (p != null) {
            System.out.println("| " + p.getVal() + " |");
            System.out.println("-----");
            p = p.getNext();
        }
        System.out.println();
    }

}
