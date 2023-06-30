package listapoo.Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador();

        boolean rodando = true;

        while (rodando) {
            System.out.println();
            System.out.println("O que você deseja fazer?");
            System.out.println();
            System.out.println("1- Adicionar produto");
            System.out.println("2- Exibir produtos cadastrados");
            System.out.println("3- Remover um produto pelo nome");
            System.out.println("4- Sair");

            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    gerenciador.adicionarProduto(entrada);
                    break;
                case 2:
                    gerenciador.exibirProdutos();
                    break;
                case 3:
                    gerenciador.removerProduto(entrada);
                    break;
                case 4:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        System.out.println();
        System.out.println("Programa encerrado.");
    }
}
