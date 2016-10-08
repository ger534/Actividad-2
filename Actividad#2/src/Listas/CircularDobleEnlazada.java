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
        private GenNodo<T> _tail;


	public CircularDobleEnlazada(){
		this._raiz = null;
                this._tail=null;
		
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
         * Metodo que inserta un elemento en una posicion dada de la lista
         * @param pDato
         * @param pPos 
         */
        
        public void AddAtIndex(T pDato, int pPos) {
           // if (pPos <= tamaño() + 1)    {
                                    //System.out.println("Entro");

            GenNodo<T> nuevo = new GenNodo<>(pDato);
            if (pPos == 0){
                System.out.println("Aqui1");
               _raiz = nuevo;
                nuevo.set_Siguiente(_raiz);
                _tail=nuevo;
                System.out.println(_raiz.get_Siguiente().get_Dato());
                
                //nuevo.set_Anterior(null);
            }else if (pPos == -1){
                                System.out.println("Aqui2");

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
                                   System.out.println("Aqui3");

                    GenNodo<T> tmp = _raiz;
                    while (tmp.get_Siguiente()!= null) {
                        tmp = tmp.get_Siguiente();
                    }
                    tmp.set_Siguiente(nuevo);
                    nuevo.set_Siguiente(_raiz);
                    _tail=nuevo;
                    //nuevo.set_Anterior(tmp);
                  
//                    nuevo.set_next(null);
                }else {               
                    System.out.println("Aqui4");

                    GenNodo<T> tmp = _raiz;
                    for (int i = 0 ; i <= pPos - 2 ; i++)
                        tmp = tmp.get_Siguiente();
                    
                    if(tmp.get_Siguiente()==null || tmp.get_Siguiente()==_raiz){
                    System.out.println("Aqui4.1");

                    //GenNodo<T> siguiente = tmp.get_Siguiente();
                    tmp.set_Siguiente(nuevo);
                    nuevo.set_Siguiente(_raiz);
                    _tail=nuevo;
                                        System.out.println("Aqui4.1.1");
                                        //System.out.println(tamaño());


                    //nuevo.set_Anterior(tmp);
                    }else{
                                            System.out.println("Aqui4.2");

                        GenNodo<T> siguiente = tmp.get_Siguiente();
                        tmp.set_Siguiente(nuevo);
                        nuevo.set_Siguiente(siguiente);
                        _tail=nuevo;
                        //nuevo.set_Anterior(tmp);
                    }
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
