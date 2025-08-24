import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
//        5. Escreva um programa que leia 20 números e após o fim da entrada de dados,
//        exiba na tela, primeiro os elementos com conteúdo ímpar e depois os
//        elementos das posições pares.

        int[] numeros = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
//            numeros[i] = (int)(Math.random()*100);
              numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i] + " i");
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " p");
            }
        }

    }
}
