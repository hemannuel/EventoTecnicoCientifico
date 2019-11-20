package Model.Principal;

import Model.Submissoes.SubmissaoApresentacao;
import Model.Submissoes.SubmissaoCientifica;

import java.util.ArrayList;

public class Monografia extends SubmissaoApresentacao {

    private String tipo;
    private String orientador;
    private String curso;
    private String Resumo;
    private String abstractResumo;
    private int ano;
    private int NumPaginas;
    private char palavraChave;



    public Monografia( String titulo, Status status, ArrayList autores, ArrayList instituicoes, ArrayList palavraChave, String tipo,
                      String orientador, String curso, String resumo, String abstractResumo, int ano ) {
        super(max_autores, titulo, status, autores, instituicoes, palavraChave);
        this.tipo = tipo;
        this.orientador = orientador;
        this.curso = curso;
        this.Resumo = resumo;
        this.abstractResumo = abstractResumo;
        this.ano = ano;
        this.NumPaginas = NumPagina;
        this.palavraChave = 3;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getResumo() {
        return Resumo;
    }

    public void setResumo(String resumo) {
        Resumo = resumo;
    }

    public String getAbstractResumo() {
        return abstractResumo;
    }

    public void setAbstractResumo(String abstractResumo) {
        this.abstractResumo = abstractResumo;
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
}
