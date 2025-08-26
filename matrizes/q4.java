public class q4 {
    public static void main(String[] args) {
//        Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a
//        coluna) do maior valor

        int[][] v = new int[4][4];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = (int) (Math.random() * 101);
            }
        }

        int maiorValor = v[0][0];
        String locaMaiorValor = "";

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (v[i][j] > maiorValor) {
                    maiorValor = v[i][j];
                    locaMaiorValor = "v[" + i + "][" + j + "]";
                }
            }
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n"+locaMaiorValor+"\t"+maiorValor);




    }
}
