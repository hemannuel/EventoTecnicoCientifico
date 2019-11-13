package Principal;

import java.util.ArrayList;

public class Submissao  {
    String titulo;
    Status status;
    ArrayList <String> autores = new ArrayList();
    final int MAX_AUTORES ;

    public Submissao(int max_autores, String titulo, Status status, ArrayList autores) {
        MAX_AUTORES = max_autores;
        this.titulo = titulo;
        this.status = status;
        this.autores = autores;
    }

}
