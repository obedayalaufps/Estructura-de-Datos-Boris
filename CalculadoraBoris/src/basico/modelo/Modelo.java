/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico.modelo;

/**
 *
 * @author Obed
 */
public class Modelo {
    
    float v1, v2;
    
    public void registrarValores(float v1, float v2) {
        this.v1 = v1;
        this.v2 = v2;
        System.out.println("Numero1: " + v1);
        System.out.println("Numero1: " + v2);

    }
    
    public float Suma(){
        return(v1+v2);
    }
    
    public float Resta(){
        return(v1-v2);
    }
    
    public float Multiplicacion(){
        return(v1*v2);
    }
    
    public float Division(){
        return(v1/v2);
    }
    
    
}
