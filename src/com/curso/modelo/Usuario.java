package com.curso.modelo;

import java.io.Serializable;

public class Usuario  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String nombre;
	private String rol;
	
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(String nombre, String rol) {
		super();
		this.nombre = nombre;
		this.rol = rol;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", rol=" + rol + "]";
	}
	

	
	
}
