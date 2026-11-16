package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private TipoGenerador tipoGenerador;

	public SortedSet<String> getLineas() {
		return lineas;
	}

	/*public String obtenerNumeroLibre() {
		String linea;
		switch (tipoGenerador) {
			case "ultimo":
				linea = lineas.last();
				lineas.remove(linea);
				return linea;
			case "primero":
				linea = lineas.first();
				lineas.remove(linea);
				return linea;
			case "random":
				linea = new ArrayList<String>(lineas)
						.get(new Random().nextInt(lineas.size()));
				lineas.remove(linea);
				return linea;
		}
		return null;
	}

	 */

	// refafctor switch statements.

	public String obtenerNumeroLibre() {
		String numero = tipoGenerador.obtenerNumeroLibre(lineas);
		lineas.remove(numero);
		return numero;
	}

	public boolean existeNumero(String numero) { // solucioon a un bad smell de empresa.
		return lineas.contains(numero);
	}

	public boolean agregarNumero(String numero) { // solucion bad smell de empresa.
		if (!existeNumero(numero)) {
			lineas.add(numero);
			return true;
		}
		else {
			return false;
		}
	}

	public void cambiarTipoGenerador(TipoGenerador valor) {
		this.tipoGenerador = valor;
	}
}
