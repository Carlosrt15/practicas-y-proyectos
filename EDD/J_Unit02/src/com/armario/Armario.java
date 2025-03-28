package com.armario;


import java.util.Collection;
import java.util.HashSet;

public class Armario {
	private Collection<String> ropa = new HashSet<String>();
	
	public Armario() {
			super();
	}

	/**
	* M�todo que introuce la prenda que se le pasa por par�metro en el
	armario.
	* @param prenda
	* @return
	*/
	public boolean anadir(String prenda) {
		return ropa.add(prenda);
	}
	
	/**
	* M�todo que comprueba si en el armario est� la prenda que se le pasa
	como par�metro
	* @param prenda
	* @return
	*/
	public boolean comprobar(String prenda) {
		return ropa.contains(prenda);
	}
	
	/**
	* M�todo que saca del armario la prenda que se le pasa como par�metro.
	* En caso de que no est� en el armario esa prenda lanzar� una excepci�n.
	* @param prenda
	* @throws NoSuchItemException
	*/
	public void eliminar(String prenda) throws Exception {
		boolean result = ropa.remove(prenda);
		if (!result) {
			throw new Exception(prenda + " no se encuentra en el armario");
		}
	}
	
	/**
	 * @return the ropa
	 */
	public Collection<String> getRopa() {
		return ropa;
	}

	/**
	 * @param ropa the ropa to set
	 */
	public void setRopa(Collection<String> ropa) {
		this.ropa = ropa;
	}
}
