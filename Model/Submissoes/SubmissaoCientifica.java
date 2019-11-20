package Model.Submissoes;

import Model.Principal.Status;

import java.util.ArrayList;

    public class SubmissaoCientifica extends Submissao{
    private ArrayList <String> instituicoes = new ArrayList();
    private ArrayList<String > palavraChave = new ArrayList();
    private final int MAX_INSTITUICOES;



        public SubmissaoCientifica(int max_autores, int max_instituicoes,String titulo, Status status,ArrayList autores, ArrayList instituicoes, ArrayList palavraChave) {
            super(max_autores, autores, titulo, status);
           this.palavraChave = palavraChave;
           this.instituicoes = instituicoes;
           this.MAX_INSTITUICOES = max_instituicoes;
        }


        public ArrayList<String> getInstituicoes() {
            return instituicoes;
        }

        public void setInstituicoes(ArrayList<String> instituicoes) {
            this.instituicoes = instituicoes;
        }

        public ArrayList<String> getPalavraChave() {
            return palavraChave;
        }

        public void setPalavraChave(ArrayList<String> palavraChave) {
            this.palavraChave = palavraChave;
        }
    }
