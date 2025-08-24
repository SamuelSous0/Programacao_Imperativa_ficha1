public class q9 {
    public static void main(String[] args) {
//        Faça um programa que preencha um vetor de tamanho 100 com os 100
//        primeiros naturais que não são múltiplos de 7 ou que terminam com 7.

          int[] A = new int[100];
          int i = 0;
          int n = 1;

          while (i < A.length) {
              if (n % 7 != 0 || n % 10 == 7) {
                  A[i] = n;
                  i++;
              }
              n++;
          }

          for (int j = 0; j < A.length; j++) {
              System.out.print(A[j]+" | ");
          }
    }
}
