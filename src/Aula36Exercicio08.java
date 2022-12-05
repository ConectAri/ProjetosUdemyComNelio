
/*

Exercício 08
Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1051.java

Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.



 */


import java.util.Locale;
import java.util.Scanner;

public class Aula36Exercicio08 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double  renda ;
        double imposto = 0;


        System.out.print(" Qual o valor da sua renda?  R$ " );
        renda = ler.nextInt();

        if ( renda <= 2000.00){

            System.out.println(" Visto que sua renda é:" + renda + " você está isendo de imposto!!!!");
        }

         else if  (renda <= 3000.00){

             imposto = (renda - 2000.0) * 0.08;
            System.out.println(" O valor de imposto será: " + imposto);

        }
         else if ( renda <= 45000.00){

            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if ( imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        ler.close();
        }

    }

