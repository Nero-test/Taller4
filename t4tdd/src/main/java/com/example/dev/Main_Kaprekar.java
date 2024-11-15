/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.util.Arrays;
/**
 * En la rama ftr_1 se completa test1
 * En la rama frt_2 se completaron del test2 al test4
 * En la rama ftr_3 se completan todos los test
 * En la rama ftr_4 se complementan los comentarios
 *
 */
public class Main_Kaprekar {

public static void main(String[] args){
    System.out.println("Clase Main");
    //pruebas temporales
    System.out.println(kaprekarOp(3524));
    System.out.println(itKaprekar(5200));

}
    public static int kaprekarOp(int numero){
    //se crea un arreglo tipo char[] con el formato "%04d" que rellenara el string con 0 a la izquierda
    //en caso de ser necesario con un largo de 4 caracteres
    char[] digitos = String.format("%04d", numero).toCharArray();

    //se ordena de menor a mayor el arreglo
    Arrays.sort(digitos);
    String menorStr = new String(digitos);//se pasa el arreglo a un string
    int menor = Integer.parseInt(menorStr);//de string a int

    //se usa el string menor como nuevo string y se invierte el orden
    String mayorStr = new StringBuilder(menorStr).reverse().toString();
    //el string mayorStr se pasa a int
    int mayor = Integer.parseInt(mayorStr);
    //se realiza y se devuelve la resta
    return mayor-menor;
}

public static int itKaprekar(int num){
    //se inicia el loop en 1 por la instancia que se hace antes del bucle
    int loop=1;
    int resultado=kaprekarOp(num);//instancia antes del bucle
    //Se inicia el bucle hasta que el resultado sea 6174
    while (resultado!=6174){
        resultado=kaprekarOp(resultado);// se sobreescribe el resultado con la nueva operación
        loop+=1;//se incrementa el loop
    }
    return loop;
}
}
