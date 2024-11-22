import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int N = sc.nextInt();

        double[] numeros = new double[N];

        System.out.println("Digite os números:");
        for (int i = 0; i < N; i++) {
            numeros[i] = sc.nextDouble();
        }

        double maiorNumero = numeros[0];
        int posicaoMaior = 0;

        for (int i = 1; i < N; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Posição do maior número: " + posicaoMaior);

        sc.close();
    }
}
