/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.ejercicio9banco.modelo;

/**
 *
 * @author Obed
 */
public class Banco {

    private Cliente[] clientesPrincipales;
    public int cantidadClientes;

    public Banco() {
        this.clientesPrincipales = new Cliente[20];
        this.cantidadClientes = 0;
    }

    public void agregarCliente(String nombre, String correo, Double saldo) {
        for (int i = 0; i < clientesPrincipales.length; i++) {
            if (clientesPrincipales[i] == null) {
                Cliente cl = new Cliente();
                cl.setNombre(nombre);
                cl.setCorreo(correo);
                cl.setSaldo(saldo);
                clientesPrincipales[i] = cl;
                cantidadClientes++;
                return;
            }

        }
    }

    public double calcularPromedioSaldo() {
        double sumaSaldos = 0;
        for (int i = 0; i < cantidadClientes; i++) {
            sumaSaldos += clientesPrincipales[i].getSaldo();
        }
        return sumaSaldos / cantidadClientes;
    }

    public int Contador() {
        double promedio = calcularPromedioSaldo();
        int contador = 0;
        for (int i = 0; i < cantidadClientes; i++) {
            if (clientesPrincipales[i].getSaldo() < promedio) {
                contador++;
            }
        }
        return contador;
    }

    public Cliente[] ClientesDeBajoPromedio() {
        double promedio = calcularPromedioSaldo();
        int contador = Contador();
        Cliente[] clientesDebajoPromedio = new Cliente[contador];
        int indice = 0;
        for (int i = 0; i < cantidadClientes; i++) {
            if (clientesPrincipales[i].getSaldo() < promedio) {
                clientesDebajoPromedio[indice] = clientesPrincipales[i];
                indice++;
            }
        }
        return clientesDebajoPromedio;
    }

    public String mostrarClientes(Cliente[] clientes) {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : clientes) {
            sb.append(cliente.toString()).append("\n");
        }
        return sb.toString();
    }
    
    

}
