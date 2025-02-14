/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.base.arreglos.controlador;

import javax.swing.DefaultComboBoxModel;
import u1.base.arreglos.modelo.Negocio;
import u1.base.arreglos.vista.PrincipalVista;

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

    public void crearArreglo() {
        String sTamanio = frame.getTxtTamanioArreglo().getText();
        int tamanio = Integer.parseInt(sTamanio);
        negocio.crearPosicionesArreglo(tamanio);

        actualizarPosicionesArreglos();

    }

    public void agregarElementoArreglo() {
        String valor = frame.getTxtValorArreglo().getText();
        negocio.agregarValor(valor);
        frame.getTxtValorArreglo().setText("");

        actualizarPosicionesArreglos();
    }

    public void borrarArregloPrimitivo() {
        negocio.borrarArregloPrimitivo();
        actualizarPosicionesArreglos();
    }

    private void actualizarPosicionesArreglos() {
        String textoPosiciones = negocio.obtenerPosicionesArreglo();
        String textoValores = negocio.obtenerValoresArreglo();

        frame.getTxtPosicionesArreglo().setText(textoPosiciones);
        frame.getTxtValoresArreglo().setText(textoValores);
    }

    public void crearArregloObjeto() {
        String sTamanio = frame.getTxtTamanioArregloObjeto().getText();
        int tamanio = Integer.parseInt(sTamanio);
        negocio.crearPosicionesArregloObjeto(tamanio);

        actualizarPosicionesArreglosObjetos();
    }

    private void actualizarPosicionesArreglosObjetos() {
        String textoPosiciones = negocio.obtenerPosicionesArregloObjeto();
        String textoValores = negocio.obtenerValoresArregloObjeto();

        frame.getTxtPosicionesArregloObjeto().setText(textoPosiciones);
        frame.getTxtValoresArregloObjeto().setText(textoValores);
    }

    public void agregarElementoArregloObjeto() {
        String id = frame.getTxtValorArreglo().getText();
        String nombre = frame.getTxtArregloNombre().getText();
        String tipo = frame.getCmbArregloTipo().getSelectedItem().toString();
        String sNivelPoder = frame.getTxtArregloNivelPoder().getText();
        int nivelPoder = Integer.parseInt(sNivelPoder);

        negocio.agregarObjeto(id, nombre, tipo, nivelPoder);

        frame.getTxtArregloID().setText("");
        frame.getTxtArregloNivelPoder().setText("");
        frame.getTxtArregloNombre().setText("");

        actualizarPosicionesArreglosObjetos();
    }
    
    public void borrarArregloObjeto() {
        negocio.borrarArregloObjeto(frame.getTxtBorrarArregloID().getText());
        actualizarPosicionesArreglosObjetos();
    }

    public void agregarElementoListaObjeto() {
        String id = frame.getTxtListaID().getText();
        String nombre = frame.getTxtListaNombre().getText();
        String tipo = frame.getCmbListaTipo().getSelectedItem().toString();
        String sNivelPoder = frame.getTxtListaNivelPoder().getText();
        int nivelPoder = Integer.parseInt(sNivelPoder);

        negocio.agregarObjetoLista(id, nombre, tipo, nivelPoder);

        frame.getTxtListaID().setText("");
        frame.getTxtListaNivelPoder().setText("");
        frame.getTxtListaNombre().setText("");

        actualizarPosicionesListaObjetos();
    }

    private void actualizarPosicionesListaObjetos() {
        String textoPosiciones = negocio.obtenerPosicionesListaObjeto();
        String textoValores = negocio.obtenerValoresListaObjeto();

        frame.getTxtPosicionesListaObjeto().setText(textoPosiciones);
        frame.getTxtValoresListaObjeto().setText(textoValores);
    }

}
