import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas (n): ");
        int n = (int)(Math.random()*11);

        int[] linha = new int[n];
        linha[0] = 1; // primeira linha sempre 1

        for (int i = 0; i < n; i++) {
            // Imprime a linha atual
            for (int j = 0; j <= i; j++) {
                System.out.print(linha[j] + " ");
            }
            System.out.println();

            // Calcula a próxima linha de trás para frente
            for (int j = i + 1; j > 0; j--) {
                linha[j] = linha[j] + linha[j - 1];
            }
        }
    }
}
