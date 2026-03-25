import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Numero 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Numero 2: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("A soma dos dois: " + sum);*/
        System.out.print("Teu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Ola " + nome);
        scanner.close();
    }
}
