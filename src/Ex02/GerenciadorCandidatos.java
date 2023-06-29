package Ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GerenciadorCandidatos {

    private List<Candidato> candidatosCatalisa;

    public GerenciadorCandidatos() {
        candidatosCatalisa = new ArrayList<>();
    }

    public void adicionarCandidato(Scanner entrada){
        System.out.println();
        System.out.println("Para adicionar um candidato, preciso das seguintes informações:");
        System.out.println("- Número de matrícula");
        System.out.println("- Nota");
        System.out.println();

        System.out.println("Por favor, informe a matrícula:");
        int matricula = entrada.nextInt();

        System.out.println();
        System.out.println("Agora a nota:");
        double nota = entrada.nextDouble();

        Candidato candidato = new Candidato(matricula, nota);
        candidatosCatalisa.add(candidato);

        System.out.println();
        System.out.println("Tudo certo! Candidato de mátricula número "
                + candidato.getNumeMatricula() + " foi adicionado.");
    }

    public void exibirCandidatos(){
        System.out.println("Candidatos cadastrados:");

        if (candidatosCatalisa.isEmpty()){
            System.out.println("Não há candidato cadastrado!");
        } else {
            for (Candidato candidato : candidatosCatalisa) {
                System.out.println("- Número da mátricula: " + candidato.getNumeMatricula() +
                        " / Nota: " + candidato.getNota());
            }
        }
    }

    public void removerCandidato(Scanner entrada){
        System.out.println();
        System.out.println("Qual o número de mátricula do candidato a ser removido?");
        int matricula = entrada.nextInt();

        Iterator<Candidato> iterator = candidatosCatalisa.iterator();
        boolean candidatoEncontrado = false;

        while (iterator.hasNext()) {
            Candidato candidato = iterator.next();

            if (candidato.getNumeMatricula() == matricula) {
                iterator.remove();
                candidatoEncontrado = true;
                break;
            }
        }

        if (candidatoEncontrado) {
            System.out.println();
            System.out.println("Pronto! Candidato de matrícula número " + matricula + " foi removido com saucesso!");
        } else {
            System.out.println();
            System.out.println("Não encontrei esse candidato.");
        }

    }

}
