package Model.Principal;

import Model.Submissoes.SubmissaoApresentacao;

import java.util.ArrayList;

public class MiniCurso extends SubmissaoApresentacao {

    private String recursos;
    private String metodologia;

    public MiniCurso( String titulo, Status status, ArrayList autores, String resumo, String abstractResumo, int duracao) {
        super(3, titulo, status, autores, resumo, abstractResumo, duracao);
        this.setRecursos(getRecursos());
        this.setMetodologia(getMetodologia());
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }
}
