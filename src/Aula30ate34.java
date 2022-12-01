import java.util.Scanner;

public class Aula30ate34 {

    /*
    Operadores comparativos
    Operador Significado:

    > maior
    < menor
    >= maior ou igual
    <= menor ou igual
    == igual
    != diferente

    Operadores lógicos  Operador Significado:

    && E   (Todas condições devem ser verdadeiras!)

    || OU  (Pelo menos uma condição deve ser verdadeira!)

    ! NÃO  (O operador "NÃO" inverte a condição)

     ============================================

     Conceito:

    Estrutura condicional:
    É uma estrutura de controle
    que permite definir que um
    certo bloco de comandos
    somente será executado
    dependendo de uma condição


     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 5;

        System.out.println("Bom dia!!");

        if (x > 0) { //CONDIÇÃO VERDADEIRA
            System.out.println("Boa tarde!!");
        }
        System.out.println("Boa noite!!");


        System.out.println("====================================");

        // CONDICIONAL SIMPLES:

        System.out.println("Bom dia!!");

        if (x < 0) { //CONDIÇÃO FALSA
            System.out.println("Boa tarde!!");
        }
        System.out.println("Boa noite!!");

        System.out.println("");
        System.out.println("====================================");
        System.out.println("");

        // CONDICIONAL COMPOSTA MESMO QUE ESTRUTURA DE CONTROLE (IF E ELSE JUNTO):

        int horas;

        System.out.println(" Quantas horas? ");
        horas = sc.nextInt();

        // SE AS HORAS FOR MENOR DO QUE 12
        if (horas < 12) {
            System.out.println("Bom dia!!");
        } else { //SENÃO BOA TARDE
            System.out.println(" Boa tarde!!");
        }

        System.out.println("");
        System.out.println("====================================");
        System.out.println("");

        // ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS, MAIS DE 3 POSSIBILIDADES:

        /*

         if ( condição 1 ) {
            comando 1
            comando 2
        }
        else {
            if ( condição 2 ) {
                comando 3
                comando 4
        }
        else {
                comando 5
                comando 6
        }
        }
         */

        System.out.println(" Quantas horas? ");
         horas = sc.nextInt();

        if ( horas < 12) {

            System.out.println(" Bom dia!!!");
        } // ATENÇÃO, NUNCA SE COLOCA CONDIÇÃO NA FRENTE DO ELSE, COLOCA-SE APENAS NO IF
        else  if ( horas < 18){

            System.out.println(" Boa tarde!!");
        }
        else {
            System.out.println(" Boa noite!!!");

            }
         sc.close();
    }
}
