/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_arbolbinario;

/**
 *
 * @author Obed
 */
public class Tree<T extends Comparable<T>> {

    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    //Agregar
    private Node<T> add(T valor, Node<T> n) {
        if (n == null) {
            return new Node<>(valor);
        }
        if (valor.compareTo(n.getData()) < 0) {
            n.setLeft(add(valor, n.getLeft()));
        } else if (valor.compareTo(n.getData()) > 0) {
            n.setRight(add(valor, n.getRight()));
        }
        return n;
    }

    public void add(T valor) {
        root = add(valor, root);
    }

    //Imprimir
    private void print(Node<T> n) {
        if (n != null) {
            System.out.println(n.getData());
            print(n.getLeft());
            print(n.getRight());
        }
    }

    public void print() {
        print(root);
    }

    //Retorne boolean si encuentra un elemento
    private boolean find(T val, Node<T> n) {
        if (n == null) {
            return false;
        }
        int cmp = val.compareTo(n.getData());
        if (cmp == 0) {
            return true;
        } else if (cmp < 0) {
            return find(val, n.getLeft());
        } else {
            return find(val, n.getRight());
        }
    }

    public boolean find(T val) {
        return find(val, root);
    }

    //Retorne el valor mas pequeño del arbol
    private T getMin(Node<T> n) {
        while (n.getLeft() != null) {
            n = n.getLeft();
        }
        return n.getData();
    }

    public T getMin() {
        if (root == null) {
            throw new RuntimeException("El arbol esta vacio.");
        }
        return getMin(root);
    }

    //Retorne la cantidad de nodos
    private int countNodes(Node<T> n) {
        if (n == null) {
            return 0;
        }
        return 1 + countNodes(n.getLeft()) + countNodes(n.getRight());
    }

    public int countNodes() {
        return countNodes(root);
    }

    //Retorne la cantidad de hojas
    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(Node<T> n) {
        if (n == null) {
            return 0;
        }
        if (n.getLeft() == null && n.getRight() == null) {
            return 1;
        }
        int hojasIzquierda = countLeaves(n.getLeft());
        int hojasDerecha = countLeaves(n.getRight());

        int total = hojasIzquierda + hojasDerecha;
        return total;
    }
}
