/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.arraylist.controlador;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import u1.arraylist.modelo.Estudiante;
import u1.arraylist.modelo.Negocio;
import u1.arraylist.vista.PrincipalVista;

/**
 *
 * @author Boris Perez
 */
public class PrincipalControlador {

    private Negocio negocio;
    private PrincipalVista frame;

    public PrincipalControlador(PrincipalVista frame) {
        negocio = new Negocio();
        this.frame = frame;
    }

    public void agregarEstudiante() {
        String nombre = frame.getTxtNombre().getText();
        String apellido = frame.getTxtApellido().getText();
        String codigo = frame.getTxtCodigo().getText();
        int edad = Integer.parseInt(frame.getTxtEdad().getText());
        double promedio = Double.parseDouble(frame.getTxtPromedio().getText());

        negocio.agregarEstudiante(nombre, apellido, edad, promedio, codigo);

        ArrayList<Estudiante> listaEstudiantes = negocio.obtenerEstudiantes();
        if (listaEstudiantes != null && !listaEstudiantes.isEmpty()) {

            DefaultListModel<String> listModel = (DefaultListModel) frame.getLstEstudiantes().getModel();
            listModel.removeAllElements();

            for (Estudiante estudiante : listaEstudiantes) {
                listModel.addElement(estudiante.getNombre() + " " + estudiante.getApellido() + " - " + estudiante.getCodigo());
            }

            limpiarCampos();
        }
    }

    public void limpiarCampos() {
        frame.getTxtApellido().setText("");
        frame.getTxtNombre().setText("");
        frame.getTxtPromedio().setText("");
        frame.getTxtEdad().setText("");
        frame.getTxtCodigo().setText("");

    }

    public void cargarDatosEstudiante() {

        String lineaEstudiante = frame.getLstEstudiantes().getSelectedValue();
        if (!lineaEstudiante.isBlank()) {
            String[] datosEstudianteSeleccionado = lineaEstudiante.split(" - ");
            String codigo = datosEstudianteSeleccionado[1];

            if (!codigo.isBlank()) {
                Estudiante e = negocio.buscarEstudiante(codigo);
                if (e != null) {
                    frame.getTxtVerNombre().setText(e.getNombre());
                    frame.getTxtVerApellido().setText(e.getApellido());
                    frame.getTxtVerEdad().setText("" + e.getEdad());
                    frame.getTxtVerPromedio().setText("" + e.getPromedio());
                    frame.getTxtVerCodigo().setText(e.getCodigo());
                }
            }
        }
    }

    public void habilitarActualizacion() {
        frame.getTxtVerNombre().setEditable(true);
        frame.getTxtVerApellido().setEditable(true);
        frame.getTxtVerEdad().setEditable(true);
        frame.getTxtVerPromedio().setEditable(true);
        frame.getTxtVerCodigo().setEditable(true);

        frame.getTxtVerNombre().setBackground(Color.white);
        frame.getTxtVerApellido().setBackground(Color.white);
        frame.getTxtVerEdad().setBackground(Color.white);
        frame.getTxtVerPromedio().setBackground(Color.white);
        frame.getTxtVerCodigo().setBackground(Color.white);
    }

    public void cancelarActualizacion() {
        frame.getTxtVerNombre().setEditable(false);
        frame.getTxtVerApellido().setEditable(false);
        frame.getTxtVerEdad().setEditable(false);
        frame.getTxtVerPromedio().setEditable(false);
        frame.getTxtVerCodigo().setEditable(false);

        frame.getTxtVerNombre().setBackground(new java.awt.Color(255, 255, 204));
        frame.getTxtVerNombre().setBackground(new java.awt.Color(255, 255, 204));
        frame.getTxtVerApellido().setBackground(new java.awt.Color(255, 255, 204));
        frame.getTxtVerEdad().setBackground(new java.awt.Color(255, 255, 204));
        frame.getTxtVerPromedio().setBackground(new java.awt.Color(255, 255, 204));
        frame.getTxtVerCodigo().setBackground(new java.awt.Color(255, 255, 204));

        frame.getTxtVerNombre().setText("");
        frame.getTxtVerApellido().setText("");
        frame.getTxtVerEdad().setText("");
        frame.getTxtVerPromedio().setText("");
        frame.getTxtVerCodigo().setText("");
    }

    public void guardarActualizacion() {
        // TODO Tomar los datos y actualizar el objeto dentro del arraylist
        // TODO Actualizar la lista en el ListView
        String nombre = frame.getTxtVerNombre().getText();
        String apellido = frame.getTxtVerApellido().getText();
        String codigo = frame.getTxtVerCodigo().getText();
        int edad = Integer.parseInt(frame.getTxtVerEdad().getText());
        double promedio = Double.parseDouble(frame.getTxtVerPromedio().getText());
        negocio.buscarEstudiante(codigo).setNombre(nombre);
        negocio.buscarEstudiante(codigo).setApellido(apellido);
        negocio.buscarEstudiante(codigo).setEdad(edad);
        negocio.buscarEstudiante(codigo).setPromedio(promedio);
   
        ArrayList<Estudiante> listaEstudiantes = negocio.obtenerEstudiantes();
        if (listaEstudiantes != null && !listaEstudiantes.isEmpty()) {

            DefaultListModel<String> listModel = (DefaultListModel) frame.getLstEstudiantes().getModel();
            listModel.removeAllElements();

            for (Estudiante estudiante : listaEstudiantes) {
                listModel.addElement(estudiante.getNombre() + " " + estudiante.getApellido() + " - " + estudiante.getCodigo());
            }

            limpiarCampos();
        }

    }
}
