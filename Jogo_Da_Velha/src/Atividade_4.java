import java.util.Arrays;

public class Atividade_4 {
    public static void main(String[] args) {
        int[] valores = {3, 100, 83, 35, 0, 9, 1, 92,60};
        int maior = valores[0];
        int menor = valores[0];

        for (int num : valores) {
            maior = Math.max(num, maior);
            menor = Math.min(num, menor);
        }
        System.out.println("Numeros de entrada: "+Arrays.toString(valores));
        System.out.printf("O MENOR número: %d e o MAIOR número: %d",menor,maior);
    }
}