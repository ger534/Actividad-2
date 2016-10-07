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
public class CircularSimple<T> implements GenLista<T> {

	private GenNodo<T> _raiz;

	public CircularSimple(){
		this._raiz = null;

	}
        
        /**
         * Metodo que inserta en una posicion dada
         * @param pDato
         * @param pos 
         */
	
        public void AddAtIndex(T pDato, int pPos) {
           // if (pPos <= tamaño() + 1)    {
                                    //System.out.println("Entro");

            GenNodo<T> nuevo = new GenNodo<>(pDato);
            if (pPos == 0){
                System.out.println("Aqui1");
               _raiz = nuevo;
                nuevo.set_Siguiente(_raiz);
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
                    nuevo.set_Anterior(tmp);
                  
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
                                        System.out.println("Aqui4.1.1");
                                        //System.out.println(tamaño());


                    //nuevo.set_Anterior(tmp);
                    }else{
                                            System.out.println("Aqui4.2");

                        GenNodo<T> siguiente = tmp.get_Siguiente();
                        tmp.set_Siguiente(nuevo);
                        nuevo.set_Siguiente(siguiente);
                        //nuevo.set_Anterior(tmp);
                    }
                }
		
	}
        
        /**
         * Metodo que agrega un nuevo nodo al inicio de la lista circular simple
         *@param pDato
         */
       
        public void AddFirst (T pDato){
            GenNodo<T> nuevo=new GenNodo<>(pDato);
            
            nuevo.set_Siguiente(_raiz);
            _raiz=nuevo;
        }

	@Override
	public T Borrar(int pos) {
		return null;

	}

	@Override
	public T Buscar(T pDato) {
		// TODO Auto-generated method stub
		return null;
	}

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
	@Override
	public T Retornar() {
		// TODO Auto-generated method stub
		return null;
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
         
           @Override
    public void Insertar(T pDato, int pos) {

    }
}

  



