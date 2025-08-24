import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int n = 10;

        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*11);
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        // media
        double media = 0;
        for (int i = 0; i < v.length; i++) {
            media += v[i];
        }
        media /= v.length;

        //soma dos quadrados
        double SomaQuadrados = 0;
        for (int i = 0; i < v.length; i++) {
            SomaQuadrados += Math.pow(v[i]-media, 2);
        }

        double desvior = Math.sqrt(SomaQuadrados/n-1);

        System.out.println("Media: " + media);
        System.out.println("Soma Quadrados: " + SomaQuadrados);


    }
}
