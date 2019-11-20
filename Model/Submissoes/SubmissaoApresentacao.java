package Model.Submissoes;

import Model.Principal.Status;

import java.util.ArrayList;

public class SubmissaoApresentacao extends Submissao {
    private String resumo;
    private String abstractResumo;
    private int duracao;


    public SubmissaoApresentacao(int max_autores, String titulo, Status status, ArrayList autores, String resumo, String abstractResumo, int duracao) {
        super(max_autores, autores, titulo, status);
        this.resumo = resumo;
        this.abstractResumo = abstractResumo;
        this.duracao = duracao;
    }


    @Override
    public String toString() {
        String informacoes = super.toString() + " Resumo " + resumo +"Abstract" + abstractResumo +
                "Duração" + duracao;
        return informacoes;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAbstractResumo() {
        return abstractResumo;
    }

    public void setAbstractResumo(String abstractResumo) {
        this.abstractResumo = abstractResumo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
