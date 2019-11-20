package Model.Principal;

import Model.Submissoes.SubmissaoCientifica;

import java.util.ArrayList;

public class Artigo extends SubmissaoCientifica {

    String resumo;
    String abstractResumo;
    char palavraChave;

    public Artigo( String titulo, Status status, ArrayList autores, ArrayList instituicoes, ArrayList palavraChave, int MAX_INSTITUICOES, int MAX_AUTORES ) {
        super(8, 8, titulo, status, autores, instituicoes, palavraChave);

        this.palavraChave = 3;
        this.resumo = resumo;
        this.abstractResumo = abstractResumo;
    }


    @Override
    public String toString() {
        String informacoes = super.toString() + " Resumo " + resumo + "Abstract" + abstractResumo + "Palavra-Chave" + palavraChave;

        return informacoes;
    }
}
