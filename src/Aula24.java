public class Aula24 {

    public static void main (String[] args){

        int x;
        double y;

        x=5;
        y =2 * x;

        System.out.println(x);
        System.out.println(y);

        //Ao rodar no terminal a variável saiu com 10.0

        System.out.println();
        System.out.println("===============================");
        System.out.println();


        // Calculo da área de um trapézio:
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        /*

        Boa prática:
        Sempre indique o tipo do número, se a
        expressão for de ponto flutuante (não
        inteira).
        Para double use:
        .0
        Para float use:
        f
         */

        System.out.println();
        System.out.println("===============================");
        System.out.println();







    }

}
