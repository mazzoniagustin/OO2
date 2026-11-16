package io.github.unlp.oo;

import java.time.LocalDate;
import java.util.*;

public class Afiliado {

	private String nombre;
	private int familiaresACargo;
	private double salario;
	private LocalDate fechaNacimiento;
	private PlanMedico plan;
	private List<PlanMedico> planesPasados;
	private Coseguro coseguro;
}
