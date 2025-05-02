/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PosfijoInfijo;

/**
 *
 * @author Obed
 */
public class Evaluar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expresion e = new Expresion();
        String ecuacion = "1+2*5-6/4";
        String ecuacionPosfija = e.convertirInfijaAPosfija(ecuacion);
        
        System.out.println("infija: "+ecuacion+" posfija: "+ecuacionPosfija);
        System.out.println("Solucion: "+e.evaluarPosfija(ecuacionPosfija));
        
    }
    
}
