/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColaCliente.newpackage;

import PilayCola.Queue;

/**
 *
 * @author Obed
 */
public class ColaAtencion {

    private Queue<Cliente> cola;

    public ColaAtencion() {
        cola = new Queue<>();
    }

    public void agregarCliente(Cliente c) {
        if (!c.prioritario) {
            cola.enqueue(c);
            return;
        }
        int size = cola.size();
        int posPrioritario = -1;
        for (int i = 0; i < size; i++) {
            Cliente actual = cola.dequeue();
            if (actual.prioritario) {
                posPrioritario = i;
            }
            cola.enqueue(actual);
        }
        int posInsertar;
        if (posPrioritario == -1) {
            posInsertar = 0;
        } else {
            posInsertar = posPrioritario + 3;
        }
        if (posInsertar > cola.size()) {
            posInsertar = cola.size();
        }
        Queue<Cliente> cola1 = new Queue<>();
        int i = 0;
        while (!cola.isEmpty()) {
            if (i == posInsertar) {
                cola1.enqueue(c);
            }
            cola1.enqueue(cola.dequeue());
            i++;
        }
        if (i == posInsertar) {
            cola1.enqueue(c);
        }
        cola = cola1;
    }

    public Cliente Atender() {
        return cola.dequeue();
    }

    public void mostrarCola() {
        System.out.println("Estado de la cola:");
        cola.print();
    }
}
