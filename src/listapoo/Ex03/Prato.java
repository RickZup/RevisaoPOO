package listapoo.Ex03;

import java.util.ArrayList;
import java.util.List;

public class Prato {

    private String nome;
    private List<String> ingredientes;

    public Prato(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

}
