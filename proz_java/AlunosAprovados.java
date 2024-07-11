import java.util.Scanner;

public class AlunosAprovados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastrados? ");
        int N = sc.nextInt();

        String[] nomes = new String[N];
        double[] notas1 = new double[N];
        double[] notas2 = new double[N];

        // Entrada dos dados
        for (int i = 0; i < N; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            nomes[i] = sc.next();
            System.out.printf("Digite a nota do 1º semestre de %s: ", nomes[i]);
            notas1[i] = sc.nextDouble();
            System.out.printf("Digite a nota do 2º semestre de %s: ", nomes[i]);
            notas2[i] = sc.nextDouble();
        }

        // Verificação dos alunos aprovados
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < N; i++) {
            double media = (notas1[i] + notas2[i]) / 2;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
