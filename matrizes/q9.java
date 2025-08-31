public class q9 {
    public static void main(String[] args) {
//        Faça um programa para gerar automaticamente números entre 0 e 99 de
//        uma cartela de bingo. Sabendo que cada cartela deverá conter 5 linhas de 5
//        números, gere estes dados de modo a não ter números repetidos dentro das
//        cartelas. O programa deve exibir na tela a cartela gerada. Pesquise como
//        fazer um random em java.

        int[][] v = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num;
                boolean unique;
                do {
                    num = (int)(Math.random()*100);
                    unique = true;
                    for (int x = 0; x <= i; x++) {
                        for (int y = 0; y < (x == i ? j : 5); y++) {
                            if (v[x][y] == num) {
                                unique = false;
                                break;
                            }
                        }
                        if (!unique) break;
                    }
                } while (!unique);
                v[i][j] = num;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(v[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
