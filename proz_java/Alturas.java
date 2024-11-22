import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int N = sc.nextInt();
        
        String[] names = new String[N];
        int[] ages = new int[N];
        double[] heights = new double[N];
        
        for (int i = 0; i < N; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine(); // consume the newline
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();
        }
        
        double sumHeights = 0.0;
        int countUnder16 = 0;
        for (int i = 0; i < N; i++) {
            sumHeights += heights[i];
            if (ages[i] < 16) {
                countUnder16++;
            }
        }
        
        double averageHeight = sumHeights / N;
        double percentageUnder16 = (double) countUnder16 / N * 100.0;
        
        System.out.printf("Altura média: %.2f%n", averageHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentageUnder16);
        
        for (int i = 0; i < N; i++) {
            if (ages[i] < 16) {
                System.out.println(names[i]);
            }
        }
        
        sc.close();
    }
}
