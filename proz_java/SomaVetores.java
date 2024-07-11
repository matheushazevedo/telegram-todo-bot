import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos cada vetor terá? ");
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("Vetor C, resultante da soma dos elementos de A e B:");
        for (int i = 0; i < N; i++) {
            System.out.print(C[i] + " ");
        }

        sc.close();
    }
}
