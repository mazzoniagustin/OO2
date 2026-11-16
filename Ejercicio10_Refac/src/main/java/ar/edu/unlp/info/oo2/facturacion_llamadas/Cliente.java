package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Cliente {
	public List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, String numeroTelefono) {
		this.llamadas = new LinkedList<Llamada>();
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}

	public void agregarLlamada(Llamada l) {
		llamadas.add(l);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}


	public double montoTotalLlamadas() {
		return llamadas.stream().mapToDouble(llamadas -> llamadas.costoLlamadaConDescuento(this)).sum();
	}
	public abstract double descuento();
}
