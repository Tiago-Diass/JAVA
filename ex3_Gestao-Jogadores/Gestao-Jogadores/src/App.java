import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int x;
        char opcao;
        String jogadorAadicionar;
        int jogadorAremover;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

        Jogador j1 = new Jogador("Tomas Rompante", 15, "Universal", "9");
        Jogador j2 = new Jogador("João Figueiredo", 15, "Ala", "67");
        Jogador j3 = new Jogador("Tiago Dias", 15, "Guarda- Redes", "69");
        Jogador j4 = new Jogador("Waner Filho", 17, "Universal", "7");
        Jogador j5 = new Jogador("Goncalo Serra", 15, "Pivô", "15");

        jogadores.add(j1);
        jogadores.add(j2);
        jogadores.add(j3);
        jogadores.add(j4);
        jogadores.add(j5);
        //System.out.println(jogadores); 

        do {
            System.out.println("Bom dia treinador, oque queres fazer hoje?");
            System.out.println("\n1 - Gerir Jogadores");
            System.out.println("2 - Gerir Equipa Técnica");
            System.out.println("0 - Sair da Aplicação\n");

            x = sc1.nextInt();

            switch (x) {
                case 1:
                    do{
                    
                    System.out.println("\nGerir Jogadores...");
                    System.out.println("Oque queres fazer?\n");
                    System.out.println("a - Ver Jogadores Existentes na Lista");
                    System.out.println("b - Adicionar Jogadores á Lista");
                    System.out.println("c - Remover Jogadores da Lista");
                    System.out.println("d - Sair\n");
                    opcao = sc2.next().charAt(0);

                    if(opcao == 'a') {
                       System.out.println("A tua lista de jogadores: "); 
                       for(int i = 0; i < jogadores.size(); i++){
                            System.out.println(jogadores.get(i));
                       }
                    } else if(opcao == 'b'){
                        System.out.println("Dizme o nome do jogador, a idade, a posição e e o numero de camisola(ex: João Figueiredo, 15 anos, Ala, 67)");
                        jogadorAadicionar = sc3.nextLine();
                        // Adicionar o jogador à lista
                        
                        System.out.println("Jogador adicionado com sucesso!");
                    } else if(opcao == 'c'){
                        System.out.println("Diz-me o numero do jogador que queres remover(por exemlo numro 0 remove o Tomas Rompante)");
                        jogadorAremover = sc3.nextInt();
                        jogadores.remove(jogadorAremover);
                        System.out.println("Jogador removido com sucesso!");
                    } else if(opcao == 'd'){
                        System.out.println("A sair da gestão de jogadores...");
                    } else {
                        System.out.println("Opção inválida!");
                    }

                   }while(opcao != 'd');

                    break;
            
                case 2:
                    System.out.println("Gerir Equipa Técnica");
                    break;
            
                case 0:
                    System.out.println("Adeus Treinador");
                    break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (x != 0);

        sc1.close();
        sc2.close();
        sc3.close();
    }
}
