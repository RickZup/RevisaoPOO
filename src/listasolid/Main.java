package listasolid;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pais pais1 = new Pais("BRA", "Brasil", 8515767.049);
        Pais pais2 = new Pais("ARG", "Argentina", 2780400);
        Pais pais3 = new Pais("CHL", "Chile", 756102);

        pais1.setPopulacao(211049527);
        pais2.setPopulacao(45037645);
        pais3.setPopulacao(19107216);

        PaisService paisService = new PaisService();
        paisService.adicionarPaisVizinho(pais1, pais2);
        paisService.adicionarPaisVizinho(pais1, pais3);
        paisService.adicionarPaisVizinho(pais2, pais3);

        System.out.println("--------------------------------------");
        System.out.println("Testando o programa com o pais: " + pais1.getNome());
        System.out.println("--------------------------------------");

        double densidadePopulacionalPais1 = paisService.getDensidadePopulacional(pais1);
        System.out.println("- Densidade populacional de: " + pais1.getNome() + " é " + densidadePopulacionalPais1 + " hab/km²");

        boolean vizinho = paisService.ehVizinho(pais1, pais2);
        System.out.println("- " + pais1.getNome() + " é vizinho de " + pais2.getNome() + ": " + (vizinho ? "Sim" : "Não"));

        List<Pais> vizinhosComuns = paisService.getPaisesVizinhosComuns(pais1, pais2);
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("Países vizinhos em comum entre Brasil e Argentina:");
        System.out.println("-------------------------------------------------------");
        for (Pais pais : vizinhosComuns) {
            System.out.println("- " + pais.getNome());
        }


        PaisRepository paisRepository = new PaisRepository();
        paisRepository.adicionarPais(pais1);
        paisRepository.adicionarPais(pais2);
        paisRepository.adicionarPais(pais3);

        List<Pais> paises = paisRepository.buscarPaises();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Lista de países no repositório:");
        System.out.println("-------------------------------");
        for (Pais pais : paises) {
            System.out.println("- " + pais.getNome());
        }

    }

}
