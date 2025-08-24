public class q1 {
    public static void main(String[] args) {
//        1. Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos:
//        A. Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
            int[] vetor = {1, 0, 5, -2, -5, 7};
//        B. Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma
            int v = vetor[0] + vetor[1] + vetor[5];
//        C. Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
            vetor[3] = 100;
//        D. Mostre na tela cada valor do vetor A, um em cada linha
            for (int i = 0; vetor.length > i; i++) {
                System.out.println(vetor[i]);
            }
    }
}