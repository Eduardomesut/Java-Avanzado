package funciones;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Pruebas {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Jaime");
        nombres.add("Pepe");
        nombres.add("Matt");
        nombres.add("Jonny");

        //nombres.stream().forEach(x -> System.out.println(x.toUpperCase()));
        Stream<String> resultado = nombres.stream().map(x -> x.toUpperCase());
        resultado.forEach(x -> System.out.println(x));
    }
}
