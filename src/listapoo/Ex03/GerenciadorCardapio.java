package listapoo.Ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GerenciadorCardapio {

    private List<Prato> listaPratos;

    public GerenciadorCardapio() {
        listaPratos = new ArrayList<>();
    }

    public void adicionarPrato(Scanner entrada) {
        System.out.println();
        System.out.println("Bem, para adicionar um prato vou precisar do nome do prato e seus ingredientes.");
        System.out.println("Vamos lá?");
        System.out.println("Digite o nome do prato:");
        String nome = entrada.next();

        Prato prato = new Prato(nome);

        boolean adicionarIngredientes = true;
        while (adicionarIngredientes) {
            System.out.println();
            System.out.println("Digite um ingrediente do prato (ou digite 'sair' caso queira parar por aqui, okay?):");
            String ingrediente = entrada.next();

            if (ingrediente.equalsIgnoreCase("sair")) {
                adicionarIngredientes = false;
            } else {
                prato.getIngredientes().add(ingrediente);
            }
        }

        listaPratos.add(prato);
        System.out.println();
        System.out.println("Feito! " + nome + " foi adicionado ao cardápio.");

    }

    public void exibirPratos() {
        System.out.println();
        System.out.println("Lista de pratos:");

        if (listaPratos.isEmpty()) {
            System.out.println();
            System.out.println("Nenhum prato cadastrado.");
        } else {
            for (Prato prato : listaPratos) {
                System.out.println();
                System.out.println("Nome: " + prato.getNome());
                System.out.println("Ingredientes: ");
                for (String ingrediente : prato.getIngredientes()) {
                    System.out.println("- " + ingrediente);
                }
                System.out.println();
            }
        }
    }

    public void excluirPrato(Scanner entrada) {
        System.out.println();
        System.out.println("Digite o nome do prato que deseja remover:");
        String nome = entrada.next();

        Iterator<Prato> iterator = listaPratos.iterator();
        boolean pratoEncontrado = false;

        while (iterator.hasNext()) {
            Prato prato = iterator.next();
            if (prato.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                pratoEncontrado = true;
                break;
            }
        }

        if (pratoEncontrado) {
            System.out.println();
            System.out.println("Prato removido!");
        } else {
            System.out.println();
            System.out.println("Ops... Não encontrei esse prato.");
        }
    }

}
