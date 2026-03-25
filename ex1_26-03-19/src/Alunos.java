import java.util.Scanner;

public class Alunos {
    public static int numAlunos = 20;
    private static String nomeXXX = "Tiago Dias";
    static int n = 10;
    final float pi = 3.14f;
    public static String[] nomes = new String[numAlunos]; 
    public static int[] idades = new int[numAlunos];

    public void mostrarInfo() {
        System.out.println("\nTurma 2025/2026");
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                System.out.println(nomes[i] + " (" + idades[i] + " ano(s))");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Alunos al = new Alunos();

        System.out.println(Alunos.n); // Consigo aceder por causa do static
        System.out.println(al.pi); // Consigo aceder porque implementei na linha 12
        System.out.println(nomeXXX); // Esta privada mas como tem static consigo aceder


        Scanner idadeX = new Scanner(System.in);
        Scanner nomeX = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Qual o teu nome, numero " + (i + 1) + ": ");
            String nome = nomeX.nextLine();
            nomes[i] = nome;
            System.out.println(nomes[i] + " Qual a tua idade: ");
            int idade = idadeX.nextInt();
            idades[i] = idade;
        }
        nomeX.close();
        idadeX.close();
        al.mostrarInfo();
    }
}