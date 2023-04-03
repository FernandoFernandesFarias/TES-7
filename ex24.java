import java.util.Scanner;
public class ex24 {
 public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);
    System.out.print("Digite a quantidade de números que deseja verificar: ");
    int n = input.nextInt();

    int[] numeros = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Digite o " + (i + 1) + "º número: ");
        numeros[i] = input.nextInt();
    }

    for (int i = 0; i < n; i++) {
        if (numeros[i] > 0) {
            System.out.println(numeros[i] + " é positivo.");
        } else if (numeros[i] < 0) {
            System.out.println(numeros[i] + " é negativo.");
        } else {
            System.out.println(numeros[i] + " é zero.");
        }
    }
} 
} 


