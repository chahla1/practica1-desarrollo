package coleccion;

import coleccion.elementos.Moneda;
import coleccion.elementos.Sello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Aniadir una nueva moneda");
            System.out.println("2. Aniadir un nuevo sello");
            System.out.println("3. Mostrar todas las monedas");
            System.out.println("4. Mostrar todos los sellos");
            System.out.println("5. Mostrar el precio total de la coleccion");
            System.out.println("6. Mostrar la rareza media de la coleccion");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Aniadir una nueva moneda:");
                    System.out.print("Pais: ");
                    String pais = scanner.next();
                    System.out.print("Autoridad: ");
                    String autoridad = scanner.next();
                    System.out.print("Año: ");
                    int annus = scanner.nextInt();
                    System.out.print("Valor nominal: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Unidad monetaria: ");
                    String unidad = scanner.next();
                    System.out.print("Rareza: ");
                    int rareza = scanner.nextInt();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Composicion: ");
                    String composicion = scanner.next();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Diametro: ");
                    double diametro = scanner.nextDouble();
                    System.out.print("Grosor: ");
                    double grosor = scanner.nextDouble();
                    System.out.print("Estado de Conservacion: ");
                    String estadoStr = scanner.next();
                    EstadoConservacionMoneda estado = EstadoConservacionMoneda.valueOf(estadoStr);

                    // Creamos el objeto moneda con los datos
                    Moneda moneda = new Moneda(pais, autoridad, annus, valor, unidad, rareza, precio, composicion, peso, diametro, grosor, estado);
                    coleccion.agregarMoneda(moneda);  // Agregamos la moneda a la coleccion
                    System.out.println("Moneda aniadida a la coleccion.");
                    break;


                case 2:
                    System.out.println("Aniadir un nuevo sello:");
                    System.out.print("Pais: ");
                    pais = scanner.next();
                    System.out.print("Autoridad: ");
                    autoridad = scanner.next();
                    System.out.print("Anio: ");
                    annus = scanner.nextInt();
                    System.out.print("Valor nominal: ");
                    valor = scanner.nextDouble();
                    System.out.print("Unidad monetaria: ");
                    unidad = scanner.next();
                    System.out.print("Rareza: ");
                    rareza = scanner.nextInt();
                    System.out.print("Precio: ");
                    precio = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Anchura: ");
                    double anchura = scanner.nextDouble();
                    System.out.print("Imagen: ");
                    String imagen = scanner.next();
                    System.out.print("Estado de Conservacion: ");
                    String estadoSelloStr = scanner.next();
                    EstadoConservacionSello estadoSello = EstadoConservacionSello.valueOf(estadoSelloStr);

                    // Creamos el objeto Sello con los datos
                    Sello sello = new Sello(pais, autoridad, annus, valor, unidad, rareza, precio, altura, anchura, imagen, estadoSello);
                    coleccion.agregarSello(sello);  // Agregamos el sello a la coleccion
                    System.out.println("Sello aniadido a la coleccion.");
                    break;
                case 3:
                    coleccion.mostrarMonedas();
                    break;
                case 4:
                    coleccion.mostrarSellos();
                    break;
                case 5:
                    System.out.println("Precio total: " + coleccion.obtenerPrecioTotal());
                    break;
                case 6:
                    System.out.println("Rareza media: " + coleccion.obtenerRarezaMedia());
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
