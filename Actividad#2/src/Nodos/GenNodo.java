/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author User
 */
public class GenNodo<T> {

	private T _Dato;
	private GenNodo<T> _Siguiente;
	private GenNodo<T> _Anterior;
	
	public GenNodo(T pDato){
		this._Dato = pDato;
		this._Siguiente = null;
		this._Anterior = null;
	}

	public T get_Dato() {
		return _Dato;
	}

	public void set_Dato(T _Dato) {
		this._Dato = _Dato;
	}

	public GenNodo<T> get_Siguiente() {
		return _Siguiente;
	}

	public void set_Siguiente(GenNodo<T> _Siguiente) {
		this._Siguiente = _Siguiente;
	}

	public GenNodo<T> get_Anterior() {
		return _Anterior;
	}

	public void set_Anterior(GenNodo<T> _Anterior) {
		this._Anterior = _Anterior;
	}
}