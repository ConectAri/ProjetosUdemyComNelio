import java.util.Scanner;

// Aula 25 entrada de dados
public class Aula25e26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        String x;
        x= sc.next();

        System.out.println("Você digitou: " + x);

        sc.close();

        System.out.println();
        System.out.println("===============================");
        System.out.println();


         */

        //Quebra de linha perndente

        int x;

        String s1 ,  s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /*
        Quando você usa um comando de
        leitura diferente do nextLine() e
        dá alguma quebra de linha, essa
        quebra de linha fica "pendente"
        na entrada padrão.
        Se você então fizer um nextLine(),
        aquela quebra de linha pendente
        será absorvida pelo nextLine().

        Solução:
        Faça um nextLine() extra antes de
        fazer o nextLine() de seu
        interesse

                Resumo da aula
        • Scanner
        • next()
        • nextInt()
        • nextDouble()
        • next().charAt(0)
        • Locale
        • Como ler até a quebra de linha
        • nextLine()
        • como limpar o buffer de leitura


         */


    }


}
