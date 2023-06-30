package listapoo.Ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciadorCardapio gerenciador = new GerenciadorCardapio();
        Scanner entrada = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println();
            System.out.println("O que deseja fazer?");
            System.out.println();
            System.out.println("1- Adicionar prato");
            System.out.println("2- Exibir todos os pratos");
            System.out.println("3- Remover prato pelo nome");
            System.out.println("4- Sair");

            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    gerenciador.adicionarPrato(entrada);
                    break;
                case 2:
                    gerenciador.exibirPratos();
                    break;
                case 3:
                    gerenciador.excluirPrato(entrada);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println();
        System.out.println("Programa encerrado.");

    }
}
