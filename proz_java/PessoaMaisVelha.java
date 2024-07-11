import java.util.Scanner;

public class PessoaMaisVelha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai cadastrar? ");
        int quantidade = sc.nextInt();

        String[] nomes = new String[quantidade];
        int[] idades = new int[quantidade];

        // Entrada dos dados
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o nome da %dª pessoa: ", i + 1);
            nomes[i] = sc.next();
            System.out.printf("Digite a idade de %s: ", nomes[i]);
            idades[i] = sc.nextInt();
        }

        // Encontrar a pessoa mais velha
        int indiceMaisVelho = 0;
        for (int i = 1; i < quantidade; i++) {
            if (idades[i] > idades[indiceMaisVelho]) {
                indiceMaisVelho = i;
            }
        }

        // Saída do resultado
        System.out.printf("A pessoa mais velha é: %s\n", nomes[indiceMaisVelho]);

        sc.close();
    }
}
