package listasolid;

import java.util.ArrayList;
import java.util.List;

public class PaisRepository {

    private List<Pais> paises;

    public PaisRepository() {
        paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public void removerPais(Pais pais) {
        paises.remove(pais);
    }

    public List<Pais> buscarPaises() {
        return paises;
    }

}
