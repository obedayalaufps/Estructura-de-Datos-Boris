/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilayCola;

/**
 *
 * @author Obed
 */
public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public void addLast(T val) {
        Node<T> n = new Node<>(val);
        if (head == null) {
            head = n;
        } else {
            Node<T> p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(n);
        }
        size++;
    }

    public void addFirst(T val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node<T> p = new Node(val);
            p.setNext(head);
            head = p;
        }
        size++;
    }

    public void delete(T val) {
        if (head == null) {
            return;
        }
        if (head.getVal() == val) {
            head = head.getNext();
            size--;
            return;
        }
        Node<T> p = head;
        while (p.getNext() != null) {
            if (p.getNext().getVal() == val) {
                p.setNext(p.getNext().getNext());
                return;
            }
            p = p.getNext();
            size--;
        }
    }

    public void deletePos(int pos) {
        if (head == null || pos < 0 || pos >= size) {
            return;
        }
        if (pos == 0) {
            head = head.getNext();
            size--;
            return;
        }
        Node<T> p = head;
        for (int i = 0; i < pos - 1; i++) {
            p = p.getNext();
        }
        p.setNext(p.getNext().getNext());
        size--;
    }

    public T getPos(int pos) {
        if (pos < 0 || pos >= size) {
            throw new RuntimeException("Posición inválida");
        }
        Node<T> p = head;
        int c = 0;
        while (p != null && c < pos) {
            c++;
            p = p.getNext();
        }
        return p.getVal();
    }

    public void print() {
        Node<T> p = head;
        while (p != null) {
            System.out.print(p.getVal() + " -> ");
            p = p.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        this.head = null;
    }

}
