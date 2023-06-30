package listasolid;

import java.util.List;

public interface IPaisService {

    void adicionarPaisVizinho(Pais pais, Pais vizinho);
    boolean ehVizinho(Pais pais, Pais vizinho);
    double getDensidadePopulacional(Pais pais);
    List<Pais> getPaisesVizinhosComuns(Pais pais1, Pais pais2);

}
