package Cinema.Dominio;

public class SessaoPorSala extends BaseIdentificador{
    private int codigoSala;
    private int codigoSessao;
    public int getCodigoSala() {
        return codigoSala;
    }
    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }
    public int getCodigoSessao() {
        return codigoSessao;
    }
    public void setCodigoSessao(int codigoSessao) {
        this.codigoSessao = codigoSessao;
    }
    public SessaoPorSala(int codigo, int codigoSala, int codigoSessao) {
        super(codigo);
        this.codigoSala = codigoSala;
        this.codigoSessao = codigoSessao;
    }
    @Override
    public String toString() {
        return "SessaoPorSala [codigo=" + codigo + "codigoSala=" + codigoSala + ", codigoSessao=" + codigoSessao + "]";
    }

}
