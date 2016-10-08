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
        CircularDobleEnlazada _dt=new CircularDobleEnlazada();
        
       /* _de.Insertar(1, 0);
        _de.Insertar(2, 1);
        _de.Insertar(10, 2);
        _de.Insertar(5, 3);

        */
        _dt.AddAtIndex(200, 0);
        _dt.AddAtIndex(300, 1);
        _dt.AddAtIndex(100, 2);
        _dt.AddAtIndex(2000, 3);
        //_dt.Search(1000);.
        
        //_dt.DeleteAtIndex(2);
        _dt.Search(200);
        
        //_dt.Imprimir();
        
    }
}
