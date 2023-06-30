package listasolid;

import java.util.ArrayList;
import java.util.List;

public class PaisService implements IPaisService {

    private List<Pais> paises;

    public PaisService() {
        paises = new ArrayList<>();
    }

    public void adicionarPaisVizinho(Pais pais, Pais vizinho) {
        pais.adicionarPaisVizinho(vizinho);
    }

    public boolean ehVizinho(Pais pais, Pais vizinho) {
        return pais.ehVizinho(vizinho);
    }

    public double getDensidadePopulacional(Pais pais) {
        return pais.getPopulacao() / pais.getArea();
    }

    public List<Pais> getPaisesVizinhosComuns(Pais pais1, Pais pais2) {
        return pais1.getPaisesVizinhosComuns(pais2);
    }

}
