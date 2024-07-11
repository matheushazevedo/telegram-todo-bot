import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor terá? ");
        int N = sc.nextInt();

        double[] numeros = new double[N];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < N; i++) {
            numeros[i] = sc.nextDouble();
        }

        // Calcula a média dos elementos do vetor
        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            soma += numeros[i];
        }
        double media = soma / N;

        System.out.printf("Média aritmética: %.3f\n", media);

        // Mostra os elementos abaixo da média
        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < N; i++) {
            if (numeros[i] < media) {
                System.out.printf("%.1f\n", numeros[i]);
            }
        }

        sc.close();
    }
}
