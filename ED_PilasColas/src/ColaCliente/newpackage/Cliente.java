/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColaCliente.newpackage;

/**
 *
 * @author Obed
 */
public class Cliente {
    String id;
    boolean prioritario;

    public Cliente(String id, boolean prioritario) {
        this.id = id;
        this.prioritario = prioritario;
    }

    @Override
    public String toString() {
        return id + (prioritario? "(P)" : "");
    }
    
}
