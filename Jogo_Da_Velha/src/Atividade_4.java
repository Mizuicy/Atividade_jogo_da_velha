import java.util.Scanner;
public class Atividade_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidade = 3;
        int nub [] = new int[quantidade];
        int i;

        int menor = 0;
        int maior = 0;

        for (i = 0; i < quantidade; i++) {
            System.out.printf("informe o %2d valor: \n", (i + 1));
            nub[i] = scanner.nextInt();
            if (i == 0) {
                menor = nub[i];
                maior = nub[i];
            } else {
                if (nub[i] < menor)
                    menor = nub[i];

                if (nub[i] > maior)
                    maior = nub[i];
            }
        }
        System.out.println("o menor numero " + menor);

        System.out.println("O maior numero " + maior);
    }
}