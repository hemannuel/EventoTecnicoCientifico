package Model;

import Model.Submissoes.Submissao;

public class Artigo extends Submissao {

    String resumo;
    String abstractResumo;
    private int MAX_AUTORES;
    private final int INSTITUICAO;
    char palavraChave = 3;

    public Artigo(int max_autores, String titulo, Status status, String resumo, String abstractResumo, int INSTITUICAO, char palavraChave) {
        super(max_autores, titulo, status);

        this.MAX_AUTORES = 8;
        this.INSTITUICAO = 8;
        this.resumo = resumo;
        this.abstractResumo = abstractResumo;
        this.palavraChave = palavraChave;
    }

    @Override
    public String toString() {
        String informacoes = super.toString() + " Resumo " + resumo + "Abstract" + abstractResumo + "Palavra-Chave" + palavraChave 


    }
}
