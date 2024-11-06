package coleccion.elementos;

public abstract class ElementoColeccionable {
    protected String pais;
    protected String autoridadGobernante;
    protected int annus;
    protected double valor;
    protected String unidadMonetaria;
    protected int rareza; // va a tener un valor de 1 a 100
    public double precio; // precio del mercado actual

    public ElementoColeccionable(String pais, String autoridadGobernante, int annus, double valor,
                                 String unidadMonetaria, int rareza, double precio) throws IllegalArgumentException {
        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.annus = annus;
        this.valor = valor;
        this.unidadMonetaria = unidadMonetaria;
        this.precio = precio;
        setRareza(rareza); // aqui llamamos al metodo setRareza para verificar el valor de rareza
    }

    public void setRareza(int rareza) {
        if (rareza < 1 || rareza > 100) {
            throw new IllegalArgumentException("La rareza tiene que estar entre 1 y 100.");
        }
        this.rareza = rareza;
    }

    public int getRareza() {
        return rareza;
    }
}
