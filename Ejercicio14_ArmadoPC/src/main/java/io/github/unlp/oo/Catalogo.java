package io.github.unlp.oo;
import java.util.*;

public class Catalogo {
    private List<Componente> componentes;




    public Componente getComponente(String cadena) {
        return componentes.stream().filter(componentes ->
                componentes.getNombre().equals(cadena)).findFirst().orElse(null);
    }
}
