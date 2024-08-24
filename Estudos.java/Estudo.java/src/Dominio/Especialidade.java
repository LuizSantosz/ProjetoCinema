package Dominio;

public class Especialidade extends BaseIdentificador {

    private String nomemclatura;

    public String getNomemclatura() {
        return nomemclatura;
    }

    public void setNomemclatura(String nomemclatura) {
        this.nomemclatura = nomemclatura;
    }

    public Especialidade(int codigo, String nomemclatura) {
        super(codigo);
        this.nomemclatura = nomemclatura;
    }
}