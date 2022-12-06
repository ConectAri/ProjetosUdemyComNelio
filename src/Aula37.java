
/*
 Uma operadora de telefonia cobra R$ 50,00 por um plano básico que dá direito a 100 minutos de telefone
 Cada minuto que exceder a franquia de 100 minutos custa R$ 2,00.
 Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu,
 daí mostrar o valor a ser pago.

 https://www.udemy.com/course/java-curso-completo/learn/lecture/10565882#overview

 */

import java.util.Locale;
import java.util.Scanner;

public class Aula37 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);


        System.out.println(" Quantos minutos consumidos? ");
        int minutos = ler.nextInt();

        double conta = 50.0;


        if (minutos > 100){
           // conta = conta + (minutos - 100) * 2.0; // pode fazer igual essa linha 30 ou 31
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta );


        ler.close();
    }
}
