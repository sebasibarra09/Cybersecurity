package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private Long cuit;
	private String nombre;
	private List<Dispositivo>dispositivos;

	public Cliente(Long cuit, String nombre) {
		this.cuit=cuit;
		this.nombre=nombre;
		this.dispositivos=new ArrayList<>();
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
