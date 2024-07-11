import java.util.Scanner;

public class DadosPessoas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int N = sc.nextInt();

        double[] alturas = new double[N];
        char[] generos = new char[N];

        // Entrada dos dados
        for (int i = 0; i < N; i++) {
            System.out.printf("Digite a altura da %dª pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Digite o gênero da %dª pessoa (M ou F): ", i + 1);
            generos[i] = sc.next().charAt(0);
        }

        // Cálculo da maior e menor altura
        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];
        for (int i = 1; i < N; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        System.out.printf("Maior altura do grupo: %.2f\n", maiorAltura);
        System.out.printf("Menor altura do grupo: %.2f\n", menorAltura);

        // Cálculo da média de altura das mulheres e contagem de homens
        int countHomens = 0;
        double somaAlturaMulheres = 0.0;
        int countMulheres = 0;
        for (int i = 0; i < N; i++) {
            if (generos[i] == 'M') {
                countHomens++;
            } else if (generos[i] == 'F') {
                somaAlturaMulheres += alturas[i];
                countMulheres++;
            }
        }

        if (countMulheres > 0) {
            double mediaAlturaMulheres = somaAlturaMulheres / countMulheres;
            System.out.printf("Média de altura das mulheres: %.2f\n", mediaAlturaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas.");
        }

        System.out.printf("Número de homens: %d\n", countHomens);

        sc.close();
    }
}
