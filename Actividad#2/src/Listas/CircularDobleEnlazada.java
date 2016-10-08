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
         * Metodo que inserta un elemento al inicio de la lista doblemente 
         * circular
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
                nuevo.set_Anterior(null);
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
                    nuevo.set_Anterior(tmp);
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
                    nuevo.set_Anterior(tmp);
                    nuevo.set_Siguiente(_raiz);
                    _tail=nuevo;
                     System.out.println("Aqui4.1.1");
                     //System.out.println(tamaño());
                    //nuevo.set_Anterior(tmp);
                    }else{
                        System.out.println("Aqui4.2");
                        GenNodo<T> siguiente = tmp.get_Siguiente();
                        tmp.set_Siguiente(nuevo);
                        nuevo.set_Anterior(tmp);
                        nuevo.set_Siguiente(siguiente);
                        _tail=nuevo;
                        //nuevo.set_Anterior(tmp);
                    }
                }
		
	}
       
          /**
         * Metodo que agrega un nuevo nodo al inicio de la lista circular doblemente
         * enlazada
         *@param pDato
         */
       
         public void AddFirst (T pDato){
            GenNodo<T> nuevo=new GenNodo<>(pDato);
            if(_raiz==null){
                _raiz=nuevo;
                _tail=nuevo;
                _tail.set_Siguiente(_raiz);
            }else{
            nuevo.set_Siguiente(_raiz);
            _raiz=nuevo;
            _tail.set_Siguiente(nuevo);
        }
        }
        
         /**
         * Metodo que inserta un elemento al final de la lista circular doblemente
         * enlazada
         */
        public void AddLast(T pDato){
            GenNodo<T> tmp = _raiz;
            GenNodo<T> nuevo= new GenNodo<>(pDato);
                
                for(int i=0;i<tamaño()-1;i++){
                    System.out.println(tmp.get_Dato());
			tmp = tmp.get_Siguiente();
                }
                
                tmp.set_Siguiente(nuevo);
                nuevo.set_Anterior(tmp);
                nuevo.set_Siguiente(_raiz);
                _tail=nuevo;
        }
        
        /**
         * Metodo que elimina un elemento segun una posicion dada
         * @param pPos
         * @return 
         */
	public T DeleteAtIndex(int pPos) {
	    if (pPos <= tamaño())    {
            if (pPos == 0) {
                _raiz = _raiz.get_Siguiente();
                _tail=_raiz;
                if (_raiz != null)
                    _raiz.set_Anterior(null);
            } else {
                GenNodo<T> tmp = _raiz;
                for (int i = 0 ; i <= pPos - 2 ; i++)
                    tmp = tmp.get_Siguiente();
                GenNodo<T> siguiente = tmp.get_Siguiente();
                siguiente = siguiente.get_Siguiente();
                tmp.set_Siguiente(siguiente);
                _tail=tmp;
                if (siguiente != null)
                    siguiente.set_Anterior(tmp);
            }
            
	}
            return null;
        }
        
        /**
         * Metodo que borra el primer elemento de la lista
         */
        public void DeleteFirst(){
            _raiz=_raiz.get_Siguiente();
            _tail.set_Siguiente(_raiz);
        }
        
        
        /**
         * Metodo que borra el ulitmo elemento de la lista
         */
        
        public void DeleteLast(){
            GenNodo<T> tmp=_raiz;
            for(int i=0;i<tamaño()-2;i++){
                tmp=tmp.get_Siguiente();
            }
            tmp.set_Siguiente(_raiz);
            _tail=tmp;
            _raiz.set_Anterior(_tail);
        }
        
        
        /**
         * Metodo que retorna true o false al buscar un dato en la lista
         * @param pDato
         * @return 
         */
	
	public boolean Search(T pDato) {
            GenNodo<T> tmp=_raiz;
            for(int i= 0;i<tamaño();i++){
                if(tmp.get_Dato().equals(pDato)){
                    System.out.println(tmp.get_Dato());
                    System.out.println("Encontrado");
                    return true;
                }if(tmp.get_Dato()!= pDato){
                    System.out.println(tmp.get_Dato());
                    tmp=tmp.get_Siguiente();
                }
            }
            System.out.println("No encontrado");
            return false;
	}
        
        
         /**
	 * Devuelve el tamaño de la lista
	 * @return
	 */
        @Override
	 public int tamaño(){
	        int cant = 0;
                int cont=0;
	        GenNodo<T> tmp = _raiz;
	        while (tmp != _raiz || cont==0) {
	            tmp = tmp.get_Siguiente();
	            cant++;
                    cont++;
	        }
	        return cant;
	    }
         
         /**
          * Metodo que imprime como esta conformada la lista
          */
	@Override
	public void Imprimir() {
                System.out.println("tamano");
                System.out.println(tamaño());
		GenNodo<T> tmp = _raiz;
                
                for(int i=0;i<tamaño();i++){
                    System.out.println(tmp.get_Dato());
			tmp = tmp.get_Siguiente();
                }/*
		while (tmp != null){
			System.out.println(tmp.get_Dato());
			tmp = tmp.get_Siguiente();
                        cont+=1;
		}
*/
	}
        public int Encontrar(T pDato) {
            GenNodo<T> tmp=_raiz;
            for(int i= 0;i<tamaño();i++){
                if(tmp.get_Dato().equals(pDato)){
                    System.out.println(tmp.get_Dato());
                    return i;
                }if(tmp.get_Dato()!= pDato){
                    System.out.println(tmp.get_Dato());
                    tmp=tmp.get_Siguiente();
                }
            }
            return -1;
	}
}
