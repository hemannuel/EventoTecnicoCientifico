package Model.Submissoes;

import Model.Status;

import java.util.ArrayList;

    public class SubmissaoCientifica extends Submissao{
    private ArrayList <String> instituicoes = new ArrayList();
    private ArrayList<String> palavraChave = new ArrayList();


        public SubmissaoCientifica(int max_autores, String titulo, Status status, ArrayList instituicoes, ArrayList palavraChave) {
            super(max_autores, titulo, status);
           this.palavraChave = palavraChave;
           this.instituicoes = instituicoes;
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
