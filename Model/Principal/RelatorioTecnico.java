package Model.Principal;

import Model.Submissoes.SubmissaoCientifica;

import java.util.ArrayList;

public class RelatorioTecnico  extends SubmissaoCientifica {

    private int ano;
    private int NumPaginas;
    private String instituicao;

    public RelatorioTecnico(int max_autores, int max_instituicoes, String titulo, Status status, ArrayList autores, ArrayList instituicoes, ArrayList palavraChave,
                            int ano, int NumPaginas, String instituicao) {
        super(4, max_instituicoes, titulo, status, autores, instituicoes, 4);
        this.ano = ano;
        this.NumPaginas = NumPaginas;
        this.instituicao = instituicao;

    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

}
