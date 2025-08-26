public class q1 {
    public static void main(String[] args) {
//        Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela
//        possui.


        int[][] v = new int[4][4];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = (int) (Math.random() * 25);
            }
        }

        int contador = 0;


        System.out.println("----------| MATRIZ |----------");

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + "\t ");
            }
            System.out.println();
        }

        System.out.println("----------| MAIORES QUE 10 |----------");

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (v[i][j] > 10) {
                    System.out.println(v[i][j]);
                    contador++;
                }
            }

        }
        System.out.println("TOTAL: " + contador);



    }

}