package listasolid;


import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String codigoISO;
    private String nome;
    private double populacao;
    private double area;
    private List<Pais> paisesVizinhos;

    public Pais(String codigoISO, String nome, double area) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.area = area;
        this.paisesVizinhos = new ArrayList<>();
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void adicionarPaisVizinho(Pais pais) {
        paisesVizinhos.add(pais);
    }

    public boolean ehVizinho(Pais pais) {
        return paisesVizinhos.contains(pais);
    }

    public double getDensidadePopulacional() {
        if (area == 0) {
            return 0;
        }
        return populacao / area;
    }

    public List<Pais> getPaisesVizinhosComuns(Pais pais) {
        List<Pais> paisesVizinhosComuns = new ArrayList<>();
        for (Pais vizinho : paisesVizinhos) {
            if (pais.ehVizinho(vizinho)) {
                paisesVizinhosComuns.add(vizinho);
            }
        }
        return paisesVizinhosComuns;
    }

}
