/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.util.Arrays;

public class Main_Kaprekar {

public static void main(String[] args){
    System.out.println("Clase Main");
    System.out.println(kaprekarOp(3524));
    System.out.println(kaprekarOp(1000));

}
public static int kaprekarOp(int numero){
    //se crea un arreglo tipo char[] con el formato "%04d" que rellenara el string con 0 a la izquierda
    //en caso de ser necesario con un largo de 4 caracteres
    char[] digitos = String.format("%04d", numero).toCharArray();

    //se ordena de menor a mayor el arreglo
    Arrays.sort(digitos);
    String menorStr = new String(digitos);//se pasa el arreglo a un string
    int menor = Integer.parseInt(menorStr);//de string a int

    String mayorStr = new StringBuilder(menorStr).reverse().toString();
    int mayor = Integer.parseInt(mayorStr);


    int resta = mayor-menor;
    return resta;
}

    public static int itKaprekar(int num){
    int loop=0;
    int resta=0;
    return loop;
}
}
