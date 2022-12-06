import java.util.Scanner;

/*

Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana
(sendo 1=domingo, 2=segunda, e assim por diante).

Escrever na tela o dia da semana correspondente, conforme exemplos:

ENTRADA  SAÍDA
1         Dia da semana: domingo
4         Dia da semana: quarta
9         Dia da semana: dia da semana inválido

 */
public class Aula38A {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int dia;

        System.out.println(" Qual dia da semana? ");
        dia = ler.nextInt();

        // O NOME DESSA ESTRUTURA É IF ELSE ENCADEADO

        if ( dia == 1){

            System.out.println(" Domingo ");

        } else if (dia == 2) {

            System.out.println(" Segunda ");

        } else if (dia == 3){

            System.out.println(" Terça ");

        } else if (dia  == 4) {
            System.out.println(" Quarta ");

        } else if (dia == 5) {

            System.out.println(" Quinta ");

        } else if (dia == 6) {
            System.out.println(" Sexta ");

        } else if (dia == 7) {
            System.out.println(" Sábado ");

        } else if (dia >= 8) {

            System.out.println(" Dia da semana inválido! ");

        }

       // ler.close();


    }


}
