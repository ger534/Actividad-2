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
	 * Metodo que inserta segun posicion dada
	 */
	
        public void AddAtIndex(T pDato, int pPos) {
            if (pPos <= tamaño() + 1)    {
            GenNodo<T> nuevo = new GenNodo<>(pDato);
            if (pPos == 0){
                nuevo.set_Siguiente(_raiz);
                _raiz = nuevo;
                nuevo.set_Anterior(null);
            }else if (pPos == -1){
            	if(tamaño() == 0){
                    _raiz = nuevo;
            	}else{
                    GenNodo<T> tmp = _raiz;
                    while (tmp.get_Siguiente()!= null) {
                        tmp = tmp.get_Siguiente();
                    }
                    tmp.set_Siguiente(nuevo);
                    nuevo.set_Anterior(tmp);
            	}
            }else
                if (pPos == tamaño() + 1)    {
                    GenNodo<T> tmp = _raiz;
                    while (tmp.get_Siguiente()!= null) {
                        tmp = tmp.get_Siguiente();
                    }
                    tmp.set_Siguiente(nuevo);
                    nuevo.set_Anterior(tmp);
                  
//                    nuevo.set_next(null);
                }else {
                    GenNodo<T> tmp = _raiz;
                    for (int i = 0 ; i <= pPos - 2 ; i++)
                        tmp = tmp.get_Siguiente();
                    GenNodo<T> siguiente = tmp.get_Siguiente();
                    tmp.set_Siguiente(nuevo);
                    nuevo.set_Siguiente(siguiente);
                    nuevo.set_Anterior(tmp);
                }
		}
	}
        
        /**
         * Metodo que agrega un nuevo nodo al inicio de la lista doblemente
         * enlazada
         * @param pDato 
         */
        
        public void AddFirst( T pDato){
            GenNodo<T> nuevo=new GenNodo<>(pDato);
            if (tamaño()==0){
                _raiz=nuevo;
            }else{
                nuevo.set_Siguiente(_raiz);
                //_raiz.set_Anterior(nuevo);
                _raiz=nuevo;
            }
        
        }
        
        public void AddLast(T pDato){
            GenNodo<T> nuevo=new GenNodo<>(pDato);
            GenNodo<T> temp=_raiz;
            while(temp.get_Siguiente()!=null){
                temp=temp.get_Siguiente();
            }
            temp.set_Siguiente(nuevo);
            nuevo.set_Anterior(temp);
        }
        
        /**
         * Metodo que borrar el primer elemento de la lista doblemente enlazada
         */
        public void DeleteFirst(){
            _raiz=_raiz.get_Siguiente();
        }
        
        /**
         * Metodo que borrar el ultimo elemento de la lista doblemente enlazada
         */
        
        public void DeleteLast(){
            GenNodo<T> temp=_raiz;
            while(temp.get_Siguiente().get_Siguiente()!=null){
                temp=temp.get_Siguiente();
            }
            temp.get_Siguiente().set_Anterior(null);
            temp.set_Siguiente(null);
        }
        
        /**
	 * Borra segun la posicion dada
	 */
        
        public void DeleteAtIndex(int pPos) {
	    if (pPos <= tamaño())    {
            if (pPos == 0) {
                _raiz = _raiz.get_Siguiente();
                if (_raiz != null)
                    _raiz.set_Anterior(null);
            } else {
                GenNodo<T> tmp = _raiz;
                for (int i = 0 ; i <= pPos - 2 ; i++)
                    tmp = tmp.get_Siguiente();
                GenNodo<T> siguiente = tmp.get_Siguiente();
                siguiente = siguiente.get_Siguiente();
                tmp.set_Siguiente(siguiente);
                if (siguiente != null)
                    siguiente.set_Anterior(tmp);
            }
            
	}
        }
        
 
        /**
        *************@@@@@@@@@@@@@@ ESTE NO SE OCUPA PARA LA TAREA PERO NOS SIRVE A NOSOTROS ************@@@@@@@@@@@@@@
        */
	@Override
	public void Imprimir() {
		GenNodo<T> tmp = _raiz;
		while (tmp != null){
			System.out.println(tmp.get_Dato());
			tmp = tmp.get_Siguiente();
		}

	}
        
        /**
         * Metodo que retorna true o false si un deteminado dato se encuentra
         * en la lista
         * @param pDato
         * @return boolean que dice si lo encontró o no
         */
        
        public boolean Search(T pDato) {
		  GenNodo<T> tmp = _raiz;
	        while (tmp != null) {
	            if (tmp.get_Dato() == pDato){
	            	System.out.println("Encontrado");
	                return true;
	            }
	            tmp = tmp.get_Siguiente();
	        }
                System.out.println("No encontrado");
	        return false;
        }
        
        /**
        * ************@@@@@@@@@@@@@@ ESTE NO SE OCUPA PARA LA TAREA PERO NOS SIRVE A NOSOTROS ************@@@@@@@@@@@@@@
        */
        public int Encontrar(T pDato) {
		GenNodo<T> tmp = _raiz;
	        int i=0;
                while (tmp != null) {
	            if (tmp.get_Dato() == pDato){
	                return i;
	            }
	            tmp = tmp.get_Siguiente();
                    i++;
	        }
	        return -1;
        }
}


