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
	@Override
	public void Insertar(T pDato,int pos) {
		// TODO Auto-generated method stub

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
		GenNodo<T> tmp = _raiz;
		while (tmp != null){
			System.out.println(tmp.get_Dato());
			tmp = tmp.get_Siguiente();
		}

	}
	@Override
	public T Retornar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int tamaño() {
		// TODO Auto-generated method stub
		return 0;
	}

}

