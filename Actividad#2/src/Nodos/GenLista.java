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
public interface GenLista<T> {
	
	public void Insertar(T pDato, int pos);
	public int tamaño();
	public T Retornar();
	public T Borrar(int pos);
	public T Buscar(T pDato);
	public void Imprimir();
	

}

