
/*

    Exercício 02

    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java

    Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    Exemplos:
    Entrada: Saída:
    12        PAR
    Entrada: Saída:
    -27       IMPAR
    Entrada: Saída:
    0         PAR


 */

import java.util.Scanner;

public class Aula36Exercicio02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        System.out.println(" Qual o número? ");


        int N = ler.nextInt();

        // PARA DETERMINAR SE É PAR TEM QUE SER MOD 2
        if (N % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        ler.close();

        }

    }




/*
            if (N > 0) {

            System.out.println(N + " PAR ");

            }
            else if (N < 0) {

        System.out.println(N + " ÍMPAR");

        }
        else if (N == 0); {

        System.out.println(" Saída");

*/

