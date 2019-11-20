package Model.Principal;

import Model.Submissoes.SubmissaoApresentacao;

import java.util.ArrayList;

public class Palestra extends SubmissaoApresentacao {

    private String curriculo;


    public Palestra(int max_autores, String titulo, Status status, ArrayList autores, String resumo, String abstractResumo, int duracao, String curriculo) {
        super(max_autores, titulo, status, autores, resumo, abstractResumo, duracao);
        this.setCurriculo(curriculo);
    }

    @Override
    public String toString() {
        String informacoes = super.toString() + " Curriculo " + getCurriculo();
        return informacoes;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
}
