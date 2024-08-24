package Cinema.Dominio;

public class FilmePorAtor extends BaseIdentificador{
    private int codigoFilme;
    private int codigoAtor;
    public int getCodigoFilme() {
        return codigoFilme;
    }
    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }
    public int getCodigoAtor() {
        return codigoAtor;
    }
    public void setCodigoAtor(int codigoAtor) {
        this.codigoAtor = codigoAtor;
    }
    public FilmePorAtor(int codigo, int codigoFilme, int codigoAtor) {
        super(codigo);
        this.codigoFilme = codigoFilme;
        this.codigoAtor = codigoAtor;
    }
    @Override
    public String toString() {
        return "FilmePorAtor [codigo=" + codigo + "codigoFilme=" + codigoFilme + ", codigoAtor=" + codigoAtor + "]";
    }
    
}
