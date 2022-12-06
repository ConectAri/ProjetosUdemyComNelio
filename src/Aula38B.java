import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

/*

Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana
(sendo 1=domingo, 2=segunda, e assim por diante).

Escrever na tela o dia da semana correspondente, conforme exemplos:

ENTRADA  SAÍDA
1         Dia da semana: domingo
4         Dia da semana: quarta
9         Dia da semana: dia da semana inválido

======================================================

SINTAXE DO SWITCH-CASE

 switch (expressão){
 case valor1:
     comando1
     comando2
     break;

  case valor2:
     comando1
     comando2
     break;

   case valor3:
     comando1
     comando2
     break;


 */
public class Aula38B {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println(" Qual o número?");
        int x = ler.nextInt();

        String dia;


        switch (x){
            case 1:
                dia = "DOMINGO";
                break;
            case 2:
                dia = "SEGUNDA";
                break;
            case 3:
                dia = "TERÇA";
                break;
            case 4:
                dia = "QUARTA";
                break;
            case 5:
                dia = "QUINTA";
                break;
            case 6:
                dia = "SEXTA";
                break;
            case 7:
                dia = " SÁBADO";
                break;
            default:
                dia="Valor inválido!!!!";
                break;
        }
        System.out.println(" Dia da semana:" + dia);

    }


}
