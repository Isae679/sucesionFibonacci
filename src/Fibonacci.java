import java.util.Scanner;

public class Fibonacci {
    //metodo recursivo sucesion fibonacci
    // valor1= 0   valor2= 1


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numero de elementos: ");
        int limite =sc.nextInt();
        sc.close();
        System.out.println("sucesion fibonacci:");
        for (int i = 0; i < limite ; i++) {
            System.out.println(fibonacci(i) );


        }
        System.out.println("enecimo termino de la sucesion fibonacci: ");

    }

    private static int fibonacci(int num){

        int sucesionFibonacci;

        if(num == 0 || num == 1){ //caso base

        return num;
        }else {//llamada recursiva

            return fibonacci(num-1) + fibonacci(num-2);

        }
    }

    }


