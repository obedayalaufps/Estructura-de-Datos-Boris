/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.base.arreglos.modelo;

import java.util.ArrayList;

/**
 *
 * @author Boris Perez
 */
public class Negocio {

    private String[] arreglo;
    private SuperHeroe[] arregloObjeto;
    private ArrayList<SuperHeroe> lista;

    public Negocio() {
        lista = new ArrayList<SuperHeroe>();
    }

    public void crearPosicionesArreglo(int tamanio) {
        arreglo = new String[tamanio];
    }

    public String obtenerPosicionesArreglo() {
        String texto = "";
        for (int i = 0; i < arreglo.length; i++) {
            texto += "[ " + i + " ] - ";
        }

        // Esto se hace para eliminar la rayita luego 
        // de la ultima posicion.
        texto = texto.substring(0, texto.length() - 2);

        return texto;
    }

    public String obtenerValoresArreglo() {
        String texto = "";
        for (int i = 0; i < arreglo.length; i++) {
            String s = arreglo[i];
            if (s != null && !s.isBlank()) {
                texto += "[ " + s + " ] - ";
            } else {
                texto += "[  ] - ";
            }
        }
        texto = texto.substring(0, texto.length() - 2);

        return texto;
    }

    public void agregarValor(String valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = valor;
                return;
            }
        }

        // Si no se encuentran posiciones vacias, no se agrega
        // el elemento.
    }

    public String[] borrarArregloPrimitivo() {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo esta vacio");
            return arreglo;
        }
        String[] nuevoArreglo = new String[arreglo.length - 1];
        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i];

        }
        arreglo = nuevoArreglo;
        return arreglo;
    }

    public void crearPosicionesArregloObjeto(int tamanio) {
        arregloObjeto = new SuperHeroe[tamanio];
    }

    public String obtenerPosicionesArregloObjeto() {
        String texto = "";
        for (int i = 0; i < arregloObjeto.length; i++) {
            texto += "[ " + i + " ] - ";
        }

        // Esto se hace para eliminar la rayita luego 
        // de la ultima posicion.
        texto = texto.substring(0, texto.length() - 2);

        return texto;
    }

    public String obtenerValoresArregloObjeto() {
        String texto = "";
        for (int i = 0; i < arregloObjeto.length; i++) {
            SuperHeroe sh = arregloObjeto[i];
            if (sh != null) {
                String rutaMemoriaObjeto = sh.toString();
                String objeto = rutaMemoriaObjeto.substring(rutaMemoriaObjeto.indexOf("@") + 1);

                texto += "[ " + objeto + " ] - "; // Se manda a imprimir la posicion de memoria
            } else {
                texto += "[  ] - ";
            }
        }
        texto = texto.substring(0, texto.length() - 2);

        return texto;
    }

    public void agregarObjetoLista(String id, String nombre, String tipo, int nivelPoder) {

        SuperHeroe sh = new SuperHeroe();
        sh.setId(id);
        sh.setNivelPoder(nivelPoder);
        sh.setNombre(nombre);
        sh.setTipo(tipo);

        lista.add(sh);

    }

    public void agregarObjeto(String id, String nombre, String tipo, int nivelPoder) {

        for (int i = 0; i < arregloObjeto.length; i++) {
            if (arregloObjeto[i] == null) {

                SuperHeroe sh = new SuperHeroe();
                sh.setId(id);
                sh.setNivelPoder(nivelPoder);
                sh.setNombre(nombre);
                sh.setTipo(tipo);

                arregloObjeto[i] = sh;
                return;
            }
        }
    }

    public SuperHeroe[] borrarArregloObjeto(String id) {
        if (arregloObjeto == null || arregloObjeto.length == 0) {
            System.out.println("El arreglo esta vacio");
            return arregloObjeto;
        }
        
        int posicion = -1;
        for (int i = 0; i < arregloObjeto.length; i++) {
            if (arregloObjeto[i].getId().equals(id)) {
                posicion = i;
                break;
            }
        }
        
        for (int i = 0; i < arregloObjeto.length; i++) {
            System.out.println("Comparando: " + arregloObjeto[i].getId() + " con " + id);
            if (arregloObjeto[i].getId().equals(id)) {
                posicion = i;
                break;
            }
        }
        
        if (posicion == -1) {
            System.out.println("No se encontró un SuperHeroe con el id: " + id);
            return arregloObjeto;
        }
        SuperHeroe[] nuevoArregloObjeto = new SuperHeroe[arregloObjeto.length - 1];
        for (int i = 0, j = 0; i < nuevoArregloObjeto.length; i++) {
            if (i != posicion) {
                nuevoArregloObjeto[j] = arregloObjeto[i];
                j++;
            }
        }
        arregloObjeto = nuevoArregloObjeto;
        return arregloObjeto;
    }

    public String obtenerPosicionesListaObjeto() {
        String texto = "";
        for (int i = 0; i < lista.size(); i++) {
            texto += "[ " + i + " ] - ";
        }

        // Esto se hace para eliminar la rayita luego 
        // de la ultima posicion.
        texto = texto.substring(0, texto.length() - 2);

        return texto;
    }

    public String obtenerValoresListaObjeto() {
        String texto = "";
        for (int i = 0; i < lista.size(); i++) {
            SuperHeroe sh = lista.get(i);
            if (sh != null) {
                String rutaMemoriaObjeto = sh.toString();
                String objeto = rutaMemoriaObjeto.substring(rutaMemoriaObjeto.indexOf("@") + 1);

                texto += "[ " + objeto + " ] - "; // Se manda a imprimir la posicion de memoria
            } else {
                texto += "[  ] - ";
            }
        }
        texto = texto.substring(0, texto.length() - 2);

        return texto;
    }

}
