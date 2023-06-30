package listapoo.Ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciadorCandidatos gerenciadorCandidatos = new GerenciadorCandidatos();
        Scanner entrada = new Scanner(System.in);

        boolean rodando = true;

        while (rodando) {
            System.out.println();
            System.out.println("O que você deseja fazer?");
            System.out.println();
            System.out.println("1- Adicionar candidato");
            System.out.println("2- Exibir candidatos cadastrados");
            System.out.println("3- Remover um candidato pelo número de matrícula");
            System.out.println("4- Sair");

            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    gerenciadorCandidatos.adicionarCandidato(entrada);
                    break;
                case 2:
                    gerenciadorCandidatos.exibirCandidatos();
                    break;
                case 3:
                    gerenciadorCandidatos.removerCandidato(entrada);
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
