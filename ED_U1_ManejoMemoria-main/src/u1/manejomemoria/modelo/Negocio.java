/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.manejomemoria.modelo;

/**
 *
 * @author Boris Perez
 */
public class Negocio {

    private Persona[] personas;
    private int indice;

    public Negocio() {
        personas = new Persona[10];

    }

    public int obtenerCantidadPersonas() {
        return personas.length;
    }

    public String crearPersona(String nombre, int edad) {
        Persona p = new Persona();
        p.setNombre(nombre);
        p.setEdad(edad);

        int random = (int) (Math.random() * 1000);
        p.setId("" + random);

        buscarPosicionParaInsertar(p);

        imprimirPersonas();

        return p.getId();
    }

    public Persona cargarPersona(String id) {

        for (Persona p : personas) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Persona cargarPersonaIndice(int indice) {
        return personas[indice];
    }

    public void actualizarPersona(String id, String nombre, int edad) {
        for (Persona p : personas) {
            if (p.getId().equals(id)) {
                p.setNombre(nombre);
                p.setEdad(edad);
                return;
            }
        }
    }

    public void igualarPersona(String id) {
        for (Persona p : personas) {
            if (p.getId().equals(id)) {
                Persona p1 = p;
                buscarPosicionParaInsertar(p1);
                return;
            }
        }
    }

    private void buscarPosicionParaInsertar(Persona p) {
        for (int i = 0; i < obtenerCantidadPersonas(); i++) {
            if (personas[i] == null) {
                personas[i] = p;
                break;
            }
        }
    }

    private void imprimirPersonas() {
        for (int i = 0; i < obtenerCantidadPersonas(); i++) {
            if (personas[i] != null) {
                System.out.println(personas[i]);
            }

        }
    }
    

}
