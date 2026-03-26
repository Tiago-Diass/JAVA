import java.util.Scanner;

public class Alunos {
    public static int numAlunos = 20;
    private static String nomeXXX = "tiago dias";
    static int n = 15;
    final float pi = 3.14f;
    public static String[] nomes = new String[numAlunos]; 
    public static int[] idades = new int[numAlunos];
    
    public static void pedirDados() {
        Scanner idadeX = new Scanner(System.in);
        Scanner nomeX = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            // Pedir o nome e idade de cada aluno
            System.out.println("Qual o teu nome, numero " + (i + 1) + ": ");
            String nome = nomeX.nextLine();
            nomes[i] = nome;
            System.out.println(nomes[i] + ", Qual a tua idade: ");
            int idade = idadeX.nextInt();
            idades[i] = idade;
        }

        nomeX.close();
        idadeX.close();
    }

    public void mostrarInfo() {
        System.out.println("\nTurma 2025/2026");
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                System.out.println(nomes[i] + " (" + idades[i] + " ano(s))");
            }
        }
    }

    public static void soma(int n1, int n2) {
        int resultado = n1 + n2;
        System.out.println("A soma de " + n1 + " e " + n2 + " da: " + resultado);
    }

    public static String transforma(String txt) {
        return txt.toUpperCase();
    }

    public static void main(String[] args) throws Exception {
        Alunos al = new Alunos();

        pedirDados(); // Como e static, posso chamar diretamente sem criar um objeto
        al.mostrarInfo(); // Se nao estiver static, tenho de criar um objeto
        soma(idades[0], idades[1]); // Chamar o método soma passando as idades
        System.out.println(transforma(nomeXXX)); // Chamar o método transforma passando o nome

        /*
        System.out.println(Alunos.n); // Consigo aceder por causa do static
        System.out.println(al.pi); // Consigo aceder porque implementei na linha anterior
        System.out.println(nomeXXX); // Esta privada mas como tem static consigo aceder
        */
    }
}