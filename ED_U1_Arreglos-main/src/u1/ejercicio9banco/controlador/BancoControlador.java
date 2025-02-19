/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.ejercicio9banco.controlador;

import u1.ejercicio9banco.modelo.Banco;
import u1.ejercicio9banco.vista.BancoVista;

/**
 *
 * @author borisperezg
 */
public class BancoControlador {

    private Banco banco;
    private BancoVista vista;

    public BancoControlador(BancoVista vista) {
        this.vista = vista;
        banco = new Banco();
    }

    public void guardarcliente() {
        String nombre = vista.getTxtNombre().getText();
        String correo = vista.getTxtCorreo().getText();
        Double saldo = Double.parseDouble(vista.getTxtSaldo().getText());
        banco.agregarCliente(nombre, correo, saldo);
        vista.getTxtNombre().setText("");
        vista.getTxtCorreo().setText("");
        vista.getTxtSaldo().setText("");
    }

    public void promedioSaldo() {
        double promedio = banco.calcularPromedioSaldo();
        vista.getTxtPromedio().setText(String.valueOf(promedio));
    }

    public void cantidadClientes() {
        vista.getTxtCantidadClientes().setText(Integer.toString(banco.cantidadClientes));
    }

    public void cantidadClientesBajoPromedio() {
        vista.getTxtCantidadClientes1().setText(Integer.toString(banco.Contador()));
    }

    public void listaClientesBajoPromedio() { 
        vista.getTaListaClientes().setText(banco.mostrarClientes(banco.ClientesDeBajoPromedio()));
    }

}
