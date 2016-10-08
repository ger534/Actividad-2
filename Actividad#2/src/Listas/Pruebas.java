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
        _da.AddAtIndex(300, 1);
        _da.AddAtIndex(100, 2);
        _da.AddAtIndex(2000, 3);
        _da.Search(2000);
        
    }
}
