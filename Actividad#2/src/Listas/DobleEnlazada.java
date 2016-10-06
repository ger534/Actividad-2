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
public class DobleEnlazada<T> implements GenLista<T> {

	private GenNodo<T> _raiz;

	public DobleEnlazada(){
		this._raiz = null;
	}
	/**
	 * Devuelve el tamaño de la lista
	 * @return
	 */
	 public int tamaño(){
	        int cant = 0;
	        GenNodo<T> tmp = _raiz;
	        while (tmp != null) {
	            tmp = tmp.get_Siguiente();
	            cant++;
	        }
	        return cant;
	    }
	 /**
	  * Metodo que retorna el primer nodo de la lista
	  */
	 @Override
	public T Retornar(){
		 if (_raiz != null)
		 {
			 System.out.println(_raiz.get_Dato());
             return _raiz.get_Dato();
		 }
		 return null;	 
	 }
	 
	/**
	 * Metodo que inserta segun posicion dada
	 */
	@Override
	public void Insertar(T pDato,int pos) {
		if (pos <= tamaño() + 1)    {
            GenNodo<T> nuevo = new GenNodo<T>(pDato);
            if (pos == 1){
                nuevo.set_Siguiente(_raiz);
                if (_raiz != null)
                    
                    _raiz.set_Anterior(nuevo);
                    _raiz = nuevo;
            } else
                if (pos == tamaño() + 1)    {
                    GenNodo<T> tmp = _raiz;
                    while (tmp.get_Siguiente()!= null) {
                        tmp = tmp.get_Siguiente();
                    }
                    tmp.set_Siguiente(nuevo);
                    nuevo.set_Anterior(tmp);
                    nuevo.set_Siguiente(null);
                } else {
                    GenNodo<T> tmp = _raiz;
                    for (int i = 1 ; i <= pos - 2 ; i++)
                        tmp = tmp.get_Siguiente();
                    GenNodo<T> siguiente = tmp.get_Siguiente();
                    tmp.set_Siguiente(nuevo);
                    nuevo.set_Anterior(tmp);
                    nuevo.set_Siguiente(siguiente);
                    siguiente.set_Anterior(nuevo);
                }
        }

	}
	/**
	 * Borra segun la posicion dada
	 */
	@Override
	public T Borrar(int pos) {
	    if (pos <= tamaño())    {
            if (pos == 1) {
                _raiz = _raiz.get_Siguiente();
                if (_raiz != null)
                    _raiz.set_Anterior(null);
            } else {
                GenNodo<T> tmp = _raiz;
                for (int i = 1 ; i <= pos - 2 ; i++)
                    tmp = tmp.get_Siguiente();
                GenNodo<T> siguiente = tmp.get_Siguiente();
                siguiente = siguiente.get_Siguiente();
                tmp.set_Siguiente(siguiente);
                if (siguiente != null)
                    siguiente.set_Anterior(tmp);
            }
        }
		return null;
	}
	/**
	 * Busca segun la posicion dada
	 */
	@Override
	public T Buscar(T pDato) {
		  GenNodo<T> tmp = _raiz;
	        while (tmp != null) {
	            if (tmp.get_Dato() == pDato){
	            	System.out.println("Encontrado: "+tmp.get_Dato());
	                return tmp.get_Dato();
	            }
	            tmp = tmp.get_Siguiente();
	        }
	        return null;
	}

	@Override
	public void Imprimir() {
		GenNodo<T> tmp = _raiz;
		while (tmp != null){
			System.out.println(tmp.get_Dato());
			tmp = tmp.get_Siguiente();
		}

	}

}

