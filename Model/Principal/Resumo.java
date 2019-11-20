package Model.Principal;

import Model.Submissoes.SubmissaoCientifica;

import java.util.ArrayList;

public class Resumo extends SubmissaoCientifica {


    final int MAX_AUTORES = 8;
    final int INSTITUICAO = 8;
    char palavraChave = 3;

    public Resumo(int max_autores, String titulo, Status status, ArrayList autores, ArrayList instituicoes, ArrayList palavraChave) {
        super(max_autores, titulo, status, autores, instituicoes, palavraChave);
    }
}
