import java.util.Scanner;

public class ProblemaNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();
        
        int[] numbers = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < N; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }
        
        sc.close();
    }
}
