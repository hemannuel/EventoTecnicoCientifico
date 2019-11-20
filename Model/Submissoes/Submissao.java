package Model.Submissoes;

import Model.Principal.Status;

import java.util.ArrayList;

public class Submissao  {
    private String titulo;
    private Status status;
    private ArrayList <String> autores = new ArrayList();
    private final int MAX_AUTORES ;

    public Submissao(int max_autores, ArrayList autores, String titulo, Status status) {
        MAX_AUTORES = max_autores;
        this.titulo = titulo;
        this.status = status;
        this.autores = this.autores;

    }

    @Override
    public String toString() {
        String informacoes = "Titulo" + getTitulo() + "Status" + getStatus() + "Autores" + getAutores();
        return informacoes;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public int getMAX_AUTORES() {
        return MAX_AUTORES;
    }
}
