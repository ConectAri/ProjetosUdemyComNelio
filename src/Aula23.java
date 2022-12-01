import java.util.Locale;

// Aula 23 saída de dados - https://www.udemy.com/course/java-curso-completo/learn/lecture/10565870#overview

// Aula23

public class Aula23 {

    public static void main(String[] args) {

        //Aprendendo sobre quebra de linha

        System.out.println("Hello world!");

        System.out.println(" Bom dia! ");

        // Sem o ln NÃO GERA   QUEBRA DE LINHA
        System.out.print("Bom dia!!!");
        System.out.print("Bom dia!!!");

        System.out.println();

        System.out.println("===============================");
        System.out.println();

        int y = 32;
        System.out.println(y);

        System.out.println("===============================");
        // Para escrever o conteúdo de uma variável com
        System.out.println("Com todas as casas decimais: ");

        double x = 10.35784;
        Locale.setDefault(Locale.US); //Este o
        System.out.println(x);

        System.out.println("===============================");
        System.out.println("Apenas 2 casas decimais: ");
        // COMO IMPRIMIR EM DUAS CASAS DECIMAIS:
        //OBS: PRINT F no final
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);

        System.out.println();
        System.out.println("===============================");
        System.out.println();

        System.out.println("Apenas 4 casas decimais: ");
        // COMO IMPRIMIR EM DUAS CASAS DECIMAIS:
        //OBS: PRINT F no final
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);

        System.out.println();
        System.out.println("===============================");
        System.out.println();

        System.out.println("Resultado = " + x + " METROS ");
        System.out.println();
        System.out.println("===============================");
        System.out.println();

        // Para concatenar vários elementos em um mesmo comando de escrita

        System.out.printf(" RESULTADO = %.2f metros%n ", x);

        // O resultado no Terminal irá sair: RESULTADO = 10.36 metros

        System.out.println("===============================");
        // Para escrever o conteúdo de uma variável com
        System.out.println("Com todas as casas decimais: ");

        x = 10.35784;
        Locale.setDefault(Locale.US); //Este comando transforma o . do número em  ponto mesmo
        System.out.println(x);

        System.out.println();
        System.out.println("===============================");
        System.out.println();

        //Para concatenar vários elementos em um mesmo comando de escrita:
        // Tipos de marcadores:
        // %f = ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = quebra de linha

        // Variável string nome recebendo Maria
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);

        System.out.println();
        System.out.println("===============================");
        System.out.println();

        /*

                    Em um novo programa, inicie as
            seguintes variáveis:
            String product1 = "Computer";
            String product2 = "Office desk";
            int age = 30;
            int code = 5290;
            char gender = 'F';
            double price1 = 2100.0;
            double price2 = 650.50;
            double measure = 53.234567;

            Em seguida, usando os valores das variáveis, produza a
            seguinte saída na tela do console:
            Products:
            Computer, which price is $ 2100,00
            Office desk, which price is $ 650,50
            Record: 30 years old, code 5290 and gender: F
            Measue with eight decimal places: 53,23456700
            Rouded (three decimal places): 53,235
            US decimal point: 53.235


         */


        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double price1 = 2100;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println(" Products: ");
        System.out.printf("%s, which price is $ %.0f,%n", product1, price1);
        System.out.printf("%s,which price is $ %.2f,%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %s ", age, code, gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);


        System.out.println();
        System.out.println("===============================");
        System.out.println();


            }


        }

