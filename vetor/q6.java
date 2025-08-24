import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
//        Escreva um programa que leia o nome e a idade de 20 pessoas e exiba, após o
//        fim da entrada de dados, a idade média do grupo e o nome das pessoas com
//        idade acima da média.

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[20];
        int[] idade = new int[20];
//  Escreva um programa que leia o nome e a idade de 20 pessoas e exiba,

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome do " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            System.out.println("Digite a idade do " + (i + 1) + ": ");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }

//  após o fim da entrada de dados, a idade média do grupo

        int totalIdade = 0;
        for (int i = 0; i < nomes.length; i++) {totalIdade += idade[i];}
        double avgIdade = (double) totalIdade / nomes.length;
        System.out.println("AVG Idade: " + avgIdade);

//  e o nome das pessoas com idade acima da média.

        for (int i = 0; i < nomes.length; i++) {
            if (idade[i] > avgIdade) {
                System.out.println(nomes[i] + " acima da média de idade");
            }
        }


    }
}
