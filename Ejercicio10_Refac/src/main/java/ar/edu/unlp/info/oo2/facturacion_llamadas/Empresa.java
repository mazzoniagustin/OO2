package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	static double descuentoJur = 0.15;
	static double descuentoFis = 0;

	/* public boolean agregarNumeroTelefono(String str) {
		boolean encontre = guia.getLineas().contains(str);
		if (!encontre) {
			guia.getLineas().add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}
	}
	Bad smell linea 15: La clase guía está interesada en comportamientos que le corresponden a la clase GestorNumeroDisponibles.
	Se va a realizar un Move Method a la clase correspoondiente para realizar, lo mismo con la linea 17.
	Uncommunicative name en el parametro pasado.
	Solicion aplicando refactoring;
	 */

	public boolean agregarNumeroTelefono(String numero) {
		return guia.agregarNumero(numero);
	}


	public void registrarCliente(Cliente c) {
		c.setNumeroTelefono(guia.obtenerNumeroLibre());
		clientes.add(c);
	}



	/* public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}
	Este es un bad smell. Data class me suenta que es porque utiliza la lógica de guia, es tan facil
	coomo hacer un this.guia.obtenerNumeroLibre().
	 */

	/*public Cliente registrarUsuario(String data, String nombre, String tipo) {
		Cliente var = new Cliente();
		if (tipo.equals("fisica")) {
			var.setNombre(nombre);
			String tel = this.guia.obtenerNumeroLibre();
			var.setTipo(tipo);
			var.setNumeroTelefono(tel);
			var.setDNI(data);
		}
		else if (tipo.equals("juridica")) {
			String tel = this.guia.obtenerNumeroLibre();
			var.setNombre(nombre);
			var.setTipo(tipo);
			var.setNumeroTelefono(tel);
			var.setCuit(data);
		}
		clientes.add(var);
		return var;
	}
	Bad smells: Primitive obsession (tipo de persona un String cuando debería ser representado como objeto.)
	Duped code: En los iff's se repite el código coon una breve diferencia
	Uncommunicative Name: String data no es claro.
	Envidia de atributos: La creación de un usuario depende del cliente.

	Para resolver estos bad smells se utilizará: Move method para llevar los metodos a la clase correcta y luego lo que
	va a suceder es que el bad smell de duped code y primitive obsession se va a mantener por lo que hay que hacer es
	Extract Superclass para la diferencia de persona y luego pull up method del metodo en cuestion.

	*/
	/*public Llamada registrarLlamada(Cliente origen, Cliente destino, String t, int duracion) {
		Llamada llamada = new Llamada(t, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		origen.llamadas.add(llamada);
		return llamada;
	}
	Bad smells: Feature envy. Resolucion: Move method(la creacion de la llamada). y otra vez uncomunicative names.
	 */

	public void registrarLlamada(Cliente origen, Cliente destino, Llamada l) {
		llamadas.add(l);
		origen.agregarLlamada(l);
	}

	/*public double calcularMontoTotalLlamadas(Cliente cliente) {
		double c = 0;
		for (Llamada l : cliente.llamadas) {
			double auxc = 0;
			if (l.getTipoDeLlamada() == "nacional") {
				// el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
				auxc += l.getDuracion() * 3 + (l.getDuracion() * 3 * 0.21);
			} else if (l.getTipoDeLlamada() == "internacional") {
				// el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
				auxc += l.getDuracion() * 150 + (l.getDuracion() * 150 * 0.21) + 50;
			}

			if (cliente.getTipo() == "fisica") {
				auxc -= auxc*descuentoFis;
			} else if(cliente.getTipo() == "juridica") {
				auxc -= auxc*descuentoJur;
			}
			c += auxc;
		}
		return c;
	}
	Bad smells: Imperative loops. Refactor: Utilizar la API de Streams.
	Primitive obsession nuevamente en los ifs. Se resuelve con Extract Superclass y move method.
	Feature Envy: Move method. Basicamente es extraer las sentencias y llevarlas a llamada y realizar el calculo ahi según
	su tipo, lo mismo que con los usuarios.
	 */


	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}
	// Feature envy: Move method.

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
