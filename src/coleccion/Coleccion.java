package coleccion;

import coleccion.elementos.ElementoColeccionable;
import coleccion.elementos.Moneda;
import coleccion.elementos.Sello;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private List<ElementoColeccionable> elementos = new ArrayList<>();

    public void agregarMoneda(Moneda moneda) {
        elementos.add(moneda);
    }

    public void agregarSello(Sello sello) {
        elementos.add(sello);
    }

    public void mostrarMonedas() {
        elementos.stream()
                .filter(e -> e instanceof Moneda)
                .forEach(System.out::println);
    }

    public void mostrarSellos() {
        elementos.stream()
                .filter(e -> e instanceof Sello)
                .forEach(System.out::println);
    }

    public double obtenerPrecioTotal() {
        return elementos.stream().mapToDouble(e -> e.precio).sum();
    }

    public double obtenerRarezaMedia() {
        return elementos.stream().mapToInt(ElementoColeccionable::getRareza).average().orElse(0);
    }
}
