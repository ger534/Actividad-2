/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.GenNodo;
import Nodos.GenLista;
/**
 *
 * @author User
 */
public class CircularDobleEnlazada<T> implements GenLista<T>{
	

	private GenNodo<T> _raiz;


	public CircularDobleEnlazada(){
		this._raiz = null;
		
	}
	
	/**
	 * Devuelve el tamaño de la lista
	 * @return
	 */
	 public int tamaño(){
	        int cant = 0;
	        GenNodo<T> tmp = _raiz;
	        while (tmp != _raiz.get_Anterior()) {
	            tmp = tmp.get_Siguiente();
	            cant++;
	        }
	        return cant+1;
	    }
	
	/**
	 * Inserta al inicio
	 */
	@Override
	public void Insertar(T pDato,int pos) {
		 GenNodo<T> tmp = new GenNodo<T>(pDato);
	        if (_raiz == null && pos == 1) {
	            tmp.set_Siguiente(tmp);
	            tmp.set_Anterior(tmp);            
	            _raiz = tmp;
	        } else {
	            GenNodo<T> ultimo = _raiz.get_Anterior();
	            tmp.set_Siguiente(_raiz);
	            tmp.set_Anterior(ultimo);
	            _raiz.set_Anterior(tmp);
	            ultimo.set_Siguiente(tmp);
	            _raiz = tmp;
	        }
		
	}

	/**
	 * Borra el ultimo
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T Borrar(int pos) {
		if (_raiz == null)
			return null;
		else{
			GenNodo<T> tmp = _raiz;
			int i = 0;
			while (i<=tamaño() && pos != i){
				tmp = tmp.get_Siguiente();
				i++;
			}
			tmp = tmp.get_Anterior();
			tmp.set_Siguiente(tmp.get_Siguiente().get_Siguiente());
			tmp.set_Siguiente(null);
			
			return (T) tmp;
		}
	}

	@Override
	public void Imprimir() {
		   if (_raiz != null) {
	            GenNodo<T> tmp = _raiz;
	            do {
	            	System.out.println(tmp.get_Dato());
	                tmp = tmp.get_Siguiente();                
	            } while (tmp != _raiz);
	            System.out.println();
	        }  
		
	}



}
