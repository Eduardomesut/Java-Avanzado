package funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pruebas {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Jaime");
        nombres.add("Pepe");
        nombres.add("Matt");
        nombres.add("Jonny");

        //nombres.stream().forEach(x -> System.out.println(x.toUpperCase()));
        Stream<String> resultado = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("J"));

        resultado.forEach(x -> System.out.println(x));

        int[]numeros = {1,2,3,4,5,6,7,8,9}; 
        IntStream numsStream = Arrays.stream(numeros);
        numsStream.filter(x -> x%2 == 0)
                .forEach(x -> System.out.println(x));

        Stream<String> nombresRepes =nombres.stream()
                .filter(x -> x.equals("Pepe"))
                .map(x -> x.toUpperCase());
        nombresRepes.forEach(x -> System.out.println(x));

    }
}
