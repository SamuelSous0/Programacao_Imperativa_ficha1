import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
//        12.Faça um programa para ler 10 números DIFERENTES a serem armazenados em
//        um vetor. Os dados deverão ser armazenados no vetor na ordem que forem
//        sendo lidos, sendo que, caso o usuário digite um número que já foi digitado
//        anteriormente, o programa deverá pedir para ele digitar outro número. Note que
//        cada valor digitado pelo usuário deve ser pesquisado no vetor, verificando se ele
//        existe entre os números que já foram fornecidos. Exibir na tela o vetor final que
//        foi digitado.

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            boolean numeroValido = false;
            while (!numeroValido) {
                System.out.print("Digite o " + (i+1) + "º número: ");
                int num = sc.nextInt();

                boolean existe = false;
                for (int j = 0; j < i; j++) {
                    if (a[j] == num) {
                        existe = true;
                        break;
                    }
                }

                if (!existe) {
                    a[i] = num;
                    numeroValido = true;
                } else {
                    System.out.println("Valor já existente, digite outro número.");
                }
            }
        }

        System.out.println("Vetor final:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
