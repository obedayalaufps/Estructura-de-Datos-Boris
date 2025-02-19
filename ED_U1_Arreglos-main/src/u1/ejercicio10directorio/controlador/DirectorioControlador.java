/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.ejercicio10directorio.controlador;

import u1.ejercicio10directorio.modelo.Directorio;
import u1.ejercicio10directorio.vista.DirectorioVista;

/**
 *
 * @author borisperezg
 */
public class DirectorioControlador {
    private Directorio modelo;
    private DirectorioVista vista;

    public DirectorioControlador(DirectorioVista vista) {
        modelo = new Directorio();
        this.vista = vista;
    }
    
    public void guardar(){
        int telefono = Integer.parseInt(vista.getTxtTelefono().getText());
        modelo.agregarTelefono(telefono);
    }
    
    public void buscar(){
        int posicion = Integer.parseInt(vista.getTxtPosicion().getText());
        vista.getTxtEncontrado().setText(modelo.buscarTelefono(posicion));
    }
    
    public void eliminarValor(){
        int telefono = Integer.parseInt(vista.getTxtTelefono().getText());
        modelo.eliminarTelefono(telefono);
    }
    
    public void eliminarPosicion(){
        int posicion = Integer.parseInt(vista.getTxtPosicion().getText());
        modelo.eliminarTelefonoPorPosicion(posicion);
    }
}
