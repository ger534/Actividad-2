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
        public void Insertar(T pDato, int pPos) {
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
	 * Metodo que inserta segun posicion dada
	 */
        /*
	@Override
	public void Insertar(T pDato,int pos) {
            if (pos <= tamaño())    {
            GenNodo<T> nuevo = new GenNodo<T>(pDato);
            if (pos == 0){
                nuevo.set_Siguiente(_raiz);
                if (_raiz == null)
                    
                    _raiz.set_Anterior(nuevo);
                    _raiz = nuevo;
            } else
                if (pos == tamaño())    {
                    GenNodo<T> tmp = _raiz;
                    while (tmp.get_Siguiente()!= null) {
                        tmp = tmp.get_Siguiente();
                    }
                    tmp.set_Siguiente(nuevo);
                    nuevo.set_Anterior(tmp);
                    //nuevo.set_Siguiente(null);
                } else {
                    GenNodo<T> tmp = _raiz;
                    for (int i = 0 ; i <= pos - 2 ; i++)
                        tmp = tmp.get_Siguiente();
                    GenNodo<T> siguiente = tmp.get_Siguiente();
                    tmp.set_Siguiente(nuevo);
                    nuevo.set_Anterior(tmp);
                    nuevo.set_Siguiente(siguiente);
                    siguiente.set_Anterior(nuevo);
                }
        }

	}
        */
	
            /*
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
            
        */
        
        /**
	 * Borra segun la posicion dada
	 */
        
        public T Borrar(int pPos) {
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
}


