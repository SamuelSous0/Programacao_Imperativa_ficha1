import java.util.Random;

public class q10 {
    public static void main(String[] args) {

//        10. Leia dois vetores de inteiros x e y, cada um com 5 elementos (assuma que o
//                usuário não informa elementos repetidos). Calcule e mostre os vetores
//        resultantes em cada caso abaixo:
//        a. Soma entre x e y: soma de cada elemento de x com o elemento da
//        mesma posição em y.
//        b. Produto entre x e y: multiplicação de cada elemento de x com o elemento
//        da mesma posição em y.
//                c. Diferença entre x e y: todos os elementos de x que não existam em y.
//        d. Interseção entre x e y: apenas os elementos que aparecem nos dois
//        vetores.
//                e. Uniao entre x e y: todos os elementos de x, e todos os elementos de y que
//        não estão em x.

        Random rand = new Random();
        int[] a = new int[5];
        int[] b = new int[5];
        String linha = "----------------------------------------";

        // Gera valores únicos para A
        for (int i = 0; i < a.length; i++) {
            boolean unique;
            do {
                a[i] = rand.nextInt(11);
                unique = true;
                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
        }

        // Gera valores únicos para B
        for (int i = 0; i < b.length; i++) {
            boolean unique;
            do {
                b[i] = rand.nextInt(11);
                unique = true;
                for (int j = 0; j < i; j++) {
                    if (b[i] == b[j]) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
        }

        // a. Soma
        System.out.println("Soma:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " + " + b[i] + " = " + (a[i] + b[i]));
        }
        System.out.println(linha);

        // b. Produto
        System.out.println("Produto:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " X " + b[i] + " = " + (a[i] * b[i]));
        }
        System.out.println(linha);

        // c. Diferença (elementos de A que não estão em B)
        System.out.println("Diferença (A - B):");
        for (int i = 0; i < a.length; i++) {
            boolean existe = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.println(a[i]);
            }
        }
        System.out.println(linha);

        // d. Interseção (elementos que estão em A e B)
        System.out.println("Interseção:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
        System.out.println(linha);

        // e. União (todos elementos de A + elementos de B que não estão em A)
        System.out.println("União:");
        // Adiciona todos os elementos de A
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // Adiciona elementos de B que não estão em A
        for (int i = 0; i < b.length; i++) {
            boolean existe = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.println(b[i]);
            }
        }
    }
}
