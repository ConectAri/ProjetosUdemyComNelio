

/*

EXPRESSÃO CONDICIONAL TERNÁRIA
 */


import java.util.Scanner;

public class Aula39 {

    public static void main (String[]args){



        Scanner ler = new Scanner(System.in);

        double preco = 34.5;

        System.out.println("O preço é: " + preco);

    double desconto;

        if(preco < 20.0) {


        desconto = preco * 0.1;
    }
         else{
        desconto = preco * 0.05;
    }
        System.out.println(" O valor do desconto será: " + desconto);
        System.out.println(" =====================================================");

        // POSSO ESCREVER A MESMA CONDIÇÃO DA SEGUINTE FORMA:

        double preco1 = 34.5;

        // AQUI FALA: SE O PRECO FOR MENOR QUE 20 O DESCONTO SERÁ ELE(PRECO) VEZES 0.01 SENÃO ELE(PRECO) VEZES 0.05
        double desconto1 = (preco1 < 20.0)? preco1 * 0.1 : preco * 0.05;
        System.out.println(" Desconto será: " + desconto1);


    }





}
