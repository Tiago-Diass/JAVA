import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    public static void main(String[] args) throws Exception {
        String aux = "";
        int op = 0;
        Scanner sc = new Scanner(System.in);

        jogadores.add(new Jogador("Tomas Rompante", 15, "Universal", "9"));
        jogadores.add(new Jogador("João Figueiredo", 15, "Ala", "67"));
        jogadores.add(new Jogador("Tiago Dias", 15, "Guarda- Redes", "69"));
        jogadores.add(new Jogador("Waner Filho", 17, "Universal", "7"));
        jogadores.add(new Jogador("Goncalo Serra", 15, "Pivô", "15"));

        do {
            System.out.println("Bom dia treinador, oque queres fazer hoje?");
            System.out.println("\n1 - Gerir Jogadores");
            System.out.println("2 - Gerir Equipa Técnica");
            System.out.println("0 - Sair da Aplicação\n");
            System.out.print("A tua opção: ");

            aux = sc.nextLine(); 
            op = convertString2Int(aux);
            //x = sc1.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nGerir Jogadores...");
                    gerirJogadores();
                    break;
                
                case 2:
                    System.out.println("Gerir Equipa Técnica");
                    gerirEquipaTecnica();
                    break;
                
                case 0:
                    System.out.println("Adeus Treinador");
                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (op != 0);

        sc.close();
    }

    public static int convertString2Int(String str){
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e){
            return -1;
        }
    }

    private static void gerirJogadores() {
        String aux = "";
        int op = 0;
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        String posicao;
        String numero;

        do {
            System.out.println("\n\n\nOque queres fazer?\n");
            System.out.println("1 - Ver Jogadores Existentes na Lista");
            System.out.println("2 - Adicionar Jogadores á Lista");
            System.out.println("3 - Remover Jogadores da Lista");
            System.out.println("4 - Sair\n");
            System.out.print("A tua opção: ");
            aux = sc.nextLine();
            op = convertString2Int(aux);

            switch (op) {
                case 1:
                    System.out.println("A tua lista de jogadores: "); 
                    for(int i = 0; i < jogadores.size(); i++){
                        System.out.println(jogadores.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Inserir Jogador ");
                    System.out.print("\nNome do Jogador: ");
                    nome = sc.nextLine();
                    System.out.print("\nIdade do Jogador: ");
                    idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nPosicao do Jogador: ");
                    posicao = sc.nextLine();
                    System.out.print("\nNumero do Jogador: ");
                    numero = sc.nextLine();
                    Jogador jogaux = new Jogador(nome, idade, posicao, numero);
                    jogadores.add(jogaux);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break; 
            }
        } while (op != 4);

        sc.close();
    }

    private static void gerirEquipaTecnica() {

    }

}
