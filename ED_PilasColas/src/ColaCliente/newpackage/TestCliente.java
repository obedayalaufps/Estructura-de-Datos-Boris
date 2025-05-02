/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColaCliente.newpackage;

/**
 *
 * @author Obed
 */
public class TestCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaAtencion cola = new ColaAtencion();

        cola.agregarCliente(new Cliente("C1", false));
        cola.agregarCliente(new Cliente("C2", true));   
        cola.agregarCliente(new Cliente("C3", false));
        cola.agregarCliente(new Cliente("C4", true));   
        cola.agregarCliente(new Cliente("C5", false));
        cola.agregarCliente(new Cliente("C6", true));  

        cola.mostrarCola();
    }
}
