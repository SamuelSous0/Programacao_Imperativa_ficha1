import java.util.Scanner;
import java.util.ArrayList;

public class q5 {
    public static void main(String[] args) {
//        Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer uma
//        busca desse valor na matriz e, ao final, escrever a localização (linha e
//        coluna) ou uma mensagem de “não encontrado”

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = (int)(Math.random()*13);

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 13);
            }
        }

        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    lista.add("\n"+ valor+" está localizado: " +"v[" + i + "][" + j + "]");
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println();
        }

        System.out.println("|----------------------------------|");

        if (lista.isEmpty()) {
            System.out.println("não encontrado");

        } else {
            for (String s : lista) {
                System.out.println(s);
            }
        }



    }
}
