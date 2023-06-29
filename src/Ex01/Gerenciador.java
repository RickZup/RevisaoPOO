package Ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Gerenciador {

    private List<Produto> sistemaLoja = new ArrayList<>();

    public void adicionarProduto(Scanner entrada){
        System.out.println();
        System.out.println("Para adicionar um produto, preciso das seguintes informações:");
        System.out.println("- Nome");
        System.out.println("- Preço");
        System.out.println();

        System.out.println("Por favor, informe o nome:");
        String nome = entrada.next();

        System.out.println();
        System.out.println("Agora o preço:");
        double preco = entrada.nextDouble();

        Produto produto = new Produto(nome, preco);
        sistemaLoja.add(produto);

        System.out.println();
        System.out.println("Tudo certo! " + produto.getNome() + " foi adicionado.");
    }

    public void exibirProdutos(){
        System.out.println("Produtos cadastrados:");

        if (sistemaLoja.isEmpty()){
            System.out.println("Não há produto cadastrado!");
        } else {
            for (Produto produto : sistemaLoja) {
                System.out.println("- " + produto.getNome() + ", " + produto.getPreco());
            }
        }
    }

    public void removerProduto(Scanner entrada){
        System.out.println();
        System.out.println("Qual o nome do produto a ser removido?");
        String nome = entrada.next();

        Iterator<Produto> iterator = sistemaLoja.iterator();
        boolean produtoEncontrado = false;

        while (iterator.hasNext()) {
            Produto produto = iterator.next();

            if (produto.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                produtoEncontrado = true;
                break;
            }
        }

        if (produtoEncontrado) {
            System.out.println();
            System.out.println("Pronto! " + nome + " foi removido com saucesso!");
        } else {
            System.out.println();
            System.out.println("Não encontrei esse produto.");
        }

    }










}
