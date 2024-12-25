package funciones;

import java.util.stream.IntStream;

public class Recursividad {


    public static void main(String[] args) {
        System.out.println(sumarecursiva(5));
        System.out.println(sumaFuncional(5));
        System.out.println(factorialFuncional(5));
        System.out.println(factorialRecursivo(5));



    }

    public static int sumarecursiva (int n){
        if (n == 1){
            return 1;
        }
        return  n + sumarecursiva(n - 1);
    }

    public static int sumaFuncional (int numero){

        return IntStream.rangeClosed(1,numero)
                .reduce(0, (a,b) -> a+b);
    }
    public static int factorialRecursivo(int numero){

        if (numero == 1){
            return  1;
        }
        return numero * factorialRecursivo(numero - 1);
    }

    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1,numero)
                .reduce(1, (a,b) -> a*b);
    }


}
