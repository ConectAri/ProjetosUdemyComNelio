public class Aula27ate29 {

    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        /*

        RESULTADO NO TERMINAL:

        Raiz quadrada de 3.0 = 1.7320508075688772
        Raiz quadrada de 4.0 = 2.0
        Raiz quadrada de 25 = 5.0
        3.0 elevado a 4.0 = 81.0
        3.0 elevado ao quadrado = 9.0
        5 elevado ao quadrado = 25.0
        Valor absoluto de 4.0 = 4.0
        Valor absoluto de -5.0 = 5.0


          Funções matemáticas:
        • sqrt – raiz quadrada
        • pow – potenciação
        • abs – valor absoluto
        • Exemplos
        Maiores informações: java.lang.Math


        Incluindo funções em expressões maiores:

            delta = Math.pow(b, 2.0) - 4*a*c;
            x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            x2 = (-b - Math.sqrt(delta)) / (2.0 * a);


         */
    }
}

