public class q7 {
    public static void main(String[] args) {
//        Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que
//        estão acima da diagonal principal, dos elementos que estão abaixo da
//        diagonal principal, que estão na diagonal principal e que estão na diagonal
//        secundária.

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= (int) (Math.random() * 21);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int somaSuperior = 0;
        int somaInferior = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j > i) {
                    somaSuperior += matriz[i][j];
                } else if (j < i) {
                    somaInferior += matriz[i][j];
                }
            }
        }

        System.out.println("\nSoma Superior: " + somaSuperior
        + "\nSoma Inferior: " + somaInferior);




    }
}
