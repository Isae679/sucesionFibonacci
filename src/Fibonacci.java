import java.util.Scanner;

public class Fibonacci {
    //metodo recursivo sucesion fibonacci
    // valor1= 0   valor2= 1


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("numero de elementos: ");
        int limite =sc.nextInt();
        sc.close();
      //  System.out.println("sucesion fibonacci:");
        for (int i = 0; i < limite ; i++) {
            System.out.println(fibonacci(i) );


        }
        //System.out.println("enecimo termino de la sucesion fibonacci: ");

    }

    private static int fibonacci(int num){

        int sucesionFibonacci;

        if(num == 0 || num == 1){ //caso base

        return num;
        }else {//llamada recursiva

            return fibonacci(num-1) + fibonacci(num-2);

        }
    }

/*
 Metoodo recursivo para calcular el maximo valor de un vector
 vector = {2, 9, 6, 7, 6, 3, 4, 3}
*/

private static int maximoVector(int[] vector, int indice, int maximo){

    if (indice == vector.length -1){//caso base
        if (vector [indice] > maximo) {
            maximo = vector[indice];

        }

    }else{//llamada recursividad
        if (vector [indice] > maximo) {
            maximo = vector[indice];
        }
        maximo = maximoVector(vector, indice + 1, maximo);
    }


    return  maximo;
}

/*Metodo auxiliar que llama al metodo recursivo*/
public static int maximoVector(int[] vector){

    return maximoVector(vector, 0, 0);
}


/////Indice de un vector

    public static int indiceVector(int[] vector, int indice){
    int contador = 0 ;
    if (indice == vector.length - 1){//caso base
        if(indice == vector[indice])
            contador++;

    }else {//llamada recursiva

        if (indice == vector[indice]){
            contador++;
        }
        contador = contador + indiceVector(vector, indice + 1);

    }
    return contador;

    }
    //metodo auxiliar
    public static boolean indiceVector(int[] vector ){
    return indiceVector(vector, 0) > 0;

    }




    }


