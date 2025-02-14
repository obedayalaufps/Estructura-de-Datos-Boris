/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico.control;

import basico.modelo.Modelo;
import basico.vista.Vista;

/**
 *
 * @author Obed
 */
public class Control {
    private Vista vista;
    private Modelo modelo;
    
    
    public Control(Vista vista) {
        this.vista = vista;
        modelo = new Modelo();
    }
    
    public void registrarValores(){
        String valor1 = vista.getTxtValor1().getText();
        float v1 = Float.parseFloat(valor1);
        String valor2 = vista.getTxtValor2().getText();
        float v2 = Float.parseFloat(valor2);
        modelo.registrarValores(v1, v2);
    }
    
    public void Suma(){
        vista.getTxtResultado().setText(Float.toString(modelo.Suma()));
    }
    public void Resta(){
        vista.getTxtResultado().setText(Float.toString(modelo.Resta()));
    }
    public void Multiplicacion(){
        vista.getTxtResultado().setText(Float.toString(modelo.Multiplicacion()));
    }
    public void Division(){
        vista.getTxtResultado().setText(Float.toString(modelo.Division()));
    }
    
    
    
}
