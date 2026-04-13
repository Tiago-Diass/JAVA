import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Numero 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Numero 2: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("A soma dos dois: " + sum); */
        System.out.print("Teu nome: "); 
        String nome = scanner.nextLine();
        System.out.println("Ola " + nome);
        scanner.close(); 
    
        Operacoes op = new Operacoes(); // classe Operacoes para usar seus métodos
        System.out.println("\nSoma: " + op.soma(2, 1));
        System.out.println("Subtração: " + op.subtracao(2, 1));
        System.out.println("Divisão: " + op.divisao(2, 1));
        System.out.println("Multiplicação: " + op.multiplicacao(2, 1));

        // Modulos
        Modulos modulo1 = new Modulos("Algoritmos", 20);
        System.out.println("\nNota do módulo: " + modulo1.getNota());
        modulo1.setNota(18);
        System.out.println("Nota do módulo após alteração: " + modulo1.getNota());

        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(20);
        notas.add(19);
        notas.add(18);
        notas.add(20);
        notas.add(19);
        System.out.println(notas);
    }
}
