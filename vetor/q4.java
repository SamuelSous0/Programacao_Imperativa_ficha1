import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        4. Escreva um algoritmo que Leia 15 nomes de pessoas e armazene-os em um
//        Vetor. Após a digitação do último nome, imprima-os na sequência contrária (ou
//                seja, o último nome digitado deve ser o primeiro a ser impresso, etc)

        String[] listaNomes = new String[15];

        for (int i = 0; i < listaNomes.length; i++) {
            listaNomes[i] = sc.nextLine();
        }
        for (int i = listaNomes.length-1; i >= 0; i--) {
            System.out.println(listaNomes[i]);
        }

    }
}
