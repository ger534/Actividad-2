/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author enrique
 */
public class Pruebas {
    public static void main (String [] args){
        DobleEnlazada _de=new DobleEnlazada();
        CircularSimple _da=new CircularSimple();
        
       /* _de.Insertar(1, 0);
        _de.Insertar(2, 1);
        _de.Insertar(10, 2);
        _de.Insertar(5, 3);

        */
        _da.AddAtIndex(200, 0);
        _da.AddAtIndex(200, 1);
        _da.AddAtIndex(200, 2);
        _da.AddAtIndex(2000, 3);
        _da.AddAtIndex(200, 4);
        _da.AddAtIndex(200, 5);
        _da.AddAtIndex(200, 6);
        _da.AddAtIndex(100, 7);
        _da.AddAtIndex(200, 8);
        
        System.out.println(_da.tamaño());

        System.out.println(" ");
        //_da.Imprimir();
        _da.DeleteLast();
        _da.Imprimir();
        _da.Search(2000);
        ////_de.Imprimir();
        //_de.Search(20);
       // System.out.println(" ");
       // _de.Borrar(0);
       //_de.AddFirst(888);
       //_de.Imprimir();
        
        
        
    }
}
