import java.util.Scanner;

public class q12 {
//    12.Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça
//    ao usuário um menu de opções:
//    a. somar as duas matrizes
//    b. subtrair a primeira matriz da segunda
//    c. adicionar uma constante as duas matrizes
//    d. imprimir as matrizes.
//    Nas duas primeiras opções uma terceira matriz 3 x 3 deve ser criada. Na
//    terceira opção o valor da constante deve ser lido e o resultado da adição da
//    constante deve ser armazenado na própria matriz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];
        double[][] m3 = new double[2][2];


        System.out.println("Digite os valores da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1[i][j] = sc.nextDouble();
            }
        }


        System.out.println("Digite os valores da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = sc.nextDouble();
            }
        }

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Somar as duas matrizes");
            System.out.println("2 - Subtrair a primeira da segunda");
            System.out.println("3 - Adicionar uma constante às duas matrizes");
            System.out.println("4 - Imprimir as matrizes");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            m3[i][j] = m1[i][j] + m2[i][j];
                        }
                    }
                    System.out.println("Resultado da soma:");
                    imprimirMatriz(m3);
                    break;

                case 2:
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            m3[i][j] = m2[i][j] - m1[i][j];
                        }
                    }
                    System.out.println("Resultado da subtração (M2 - M1):");
                    imprimirMatriz(m3);
                    break;

                case 3:
                    System.out.print("Digite a constante: ");
                    double c = sc.nextDouble();
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            m1[i][j] += c;
                            m2[i][j] += c;
                        }
                    }
                    System.out.println("Constante adicionada!");
                    System.out.println("Matriz 1 após soma da constante:");
                    imprimirMatriz(m1);
                    System.out.println("Matriz 2 após soma da constante:");
                    imprimirMatriz(m2);
                    break;


                case 4: // imprimir matrizes
                    System.out.println("Matriz 1:");
                    imprimirMatriz(m1);
                    System.out.println("Matriz 2:");
                    imprimirMatriz(m2);
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    public static void imprimirMatriz(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
