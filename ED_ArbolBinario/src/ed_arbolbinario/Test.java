/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_arbolbinario;

/**
 *
 * @author Obed
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree<Integer> t = new Tree<>();
        t.add(5);
        t.add(2);
        t.add(9);
        t.add(1);
        t.add(3);
        t.print();
        int val = 10;
        System.out.println("Se encuentra "+val+"?: "+t.find(val));
        System.out.println("El valor mas pequeño es: "+t.getMin());
        System.out.println("Cantidad de nodos: "+t.countNodes());
        System.out.println("Cantidad de hojas: "+t.countLeaves());
    }    
}
