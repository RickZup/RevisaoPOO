package Ex02;

public class Candidato {

    private int numeMatricula;
    private double nota;

    public Candidato(int numeMatricula, double nota) {
        this.numeMatricula = numeMatricula;
        this.nota = nota;
    }

    public int getNumeMatricula() {
        return numeMatricula;
    }

    public double getNota() {
        return nota;
    }
}
