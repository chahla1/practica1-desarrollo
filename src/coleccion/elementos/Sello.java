package coleccion.elementos;

public class Sello extends ElementoColeccionable {
    private double altura;
    private double anchura;
    private String imagen;
    private EstadoConservacionSello estadoConservacion;

    public Sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria,
                 int rareza, double precio, double altura, double anchura, String imagen,
                 coleccion.EstadoConservacionSello estadoSello) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
        this.estadoConservacion = estadoConservacion;
    }


}
