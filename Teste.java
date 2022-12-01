
    import java.util.ArrayList;
import java.util.List;

    public class Teste {

        public static void main(String[] args) {

            int armazenamento;
            List<Integer> numeros = new ArrayList<Integer>();

            for (int i = 1000; i < 2000; i++) {

                if (i % 11 == 5) {
                    System.out.println("Número adicionado " + i);
                    armazenamento = i;
                    numeros.add(armazenamento);
                }

            }

        }

    }
}
