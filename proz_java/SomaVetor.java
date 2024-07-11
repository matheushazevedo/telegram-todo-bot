import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();
        
        double[] numbers = new double[N];
        double sum = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }
        
        System.out.print("VALORES = ");
        for (int i = 0; i < N; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        double average = sum / N;
        
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", average);
        
        sc.close();
    }
}
