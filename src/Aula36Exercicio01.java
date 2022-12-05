
/*

Exercício 01:

Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */

import java.util.Scanner;

public class Aula36Exercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       System.out.println(" Qual o número? ");

       int N = sc.nextInt();

       if ( N < 0){

           System.out.println(" Número negativo");

       }
       else{
           System.out.println(" Número positivo");
       }


    }


}
