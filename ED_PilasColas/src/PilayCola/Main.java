/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PilayCola;

/**
 *
 * @author Obed
 */
public class Main {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        LinkedList l1 = new LinkedList();
        
        //addLast()
        l.addLast(2);
        l.addLast(4);
        l.addLast(6);
        l.addLast(8);
        l.addLast(10);
        System.out.println("addLast():");
        l.print();

        //addFirst
        l1.addFirst(2);
        l1.addFirst(4);
        l1.addFirst(6);
        l1.addFirst(8);
        l1.addFirst(10);
        System.out.println("addFirst():");
        l1.print();     
        
        int n = 4;
        //delete
        System.out.println("delete():");
        l.delete(n);
        l.print();
        
        //deletePos
        System.out.println("deletePos():");
        l1.deletePos(0);
        l1.print();
        
        //getPos
        System.out.println("getPos():");
        System.out.println(l.getPos(0));
        
        l.clear();
        l.print();
        
    }
    
}
