/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.ejercicio10directorio.modelo;

/**
 *
 * @author borisperezg
 */
public class Directorio {
    
    private int[] telefonos;
    private int contador;

    public Directorio() {
        telefonos = new int[10];
        contador = 0;
    }
   
    public void agregarTelefono(int telefono){
        if(contador < telefonos.length){
            telefonos[contador]=telefono;
            contador++;
        }
        else{
            System.out.println("No hay mas espacios");
        }
         
    }
    public String buscarTelefono(int posicion){
        if(posicion >= 0 && posicion < contador){
            return Integer.toString(telefonos[posicion]);
        }
        else{
            return "Posicion no valida.";
        }
    }
    
    public void eliminarTelefono(int telefono){
        int posicion = -1;
        for (int i = 0; i < contador; i++) {
            if (telefonos[i] == telefono) {
                posicion = i;
                break;
            }
        }
        if(posicion!=-1){
            eliminarTelefonoPorPosicion(posicion);
        } else{
            System.out.println("Telefono no encontrado.");
        }
    }
    
    public void eliminarTelefonoPorPosicion(int posicion){
       if(posicion >= 0 && posicion < contador){
           for (int i = posicion; i < contador-1; i++) {
               telefonos[i] = telefonos[i+1];
           }
           contador--;
       } else{
           System.out.println("Posicion no valida.");
       }
    }
    
    
    
}
