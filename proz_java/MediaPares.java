import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor terá? ");
        int N = sc.nextInt();

        int[] numeros = new int[N];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < N; i++) {
            numeros[i] = sc.nextInt();
        }

        int somaPares = 0;
        int countPares = 0;

        for (int i = 0; i < N; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                countPares++;
            }
        }

        if (countPares > 0) {
            double mediaPares = (double) somaPares / countPares;
            System.out.printf("Média dos números pares: %.1f\n", mediaPares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
