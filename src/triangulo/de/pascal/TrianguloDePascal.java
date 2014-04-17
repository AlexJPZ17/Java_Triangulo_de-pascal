/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangulo.de.pascal;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class TrianguloDePascal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos el método Scanner
        Scanner entrada = new Scanner(System.in);
        //Declaramos una variable y un arreglo de tipo entero
        int pisos = 0;
        int[]arreglo = new int[1];
        //Mostramos un mensaje y capturalos el dato ingresado desde la consola
        System.out.println("Números de pisos");
        pisos = entrada.nextInt();
        /* Declaramos el primer ciclo for que va recorrer dependiendo
        el datos ingresado que está almacenado en la variable pisos */
        for (int i = 1; i <= pisos; i++) {
            /*Colocamos un arreglo y colocamos la variable i del ciclo for
            que será el tamaño que tendrá el arreglo cada vez que el ciclo for
            se ejecute */
            int[]pascal = new int[i];
            //Ciclo for que se decrementa
            for (int j = pisos; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                //Condición que evaluá la variable del ciclo for
                if (k==0 || k==(i -1)) {
                    pascal[k] = 1;
                }else{
                    //Sumamos los numero que están en cada poción 
                    //del arreglo para formar el triangulo
                    pascal[k] = arreglo[k] + arreglo[k -1];
                }
                System.out.print("["+pascal[k] + "]");
            }
            arreglo = pascal;
            System.out.println();
        }
    }
    
}
