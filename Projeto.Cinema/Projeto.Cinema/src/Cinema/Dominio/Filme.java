package Cinema.Dominio;

public class Filme extends BaseIdentificador{
    private String genero;
    private int duracao;
    private String titulo;
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Filme(int codigo, String genero, int duracao, String titulo) {
        super(codigo);
        this.genero = genero;
        this.duracao = duracao;
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Filme [codigo=" + codigo + "genero=" + genero + ", duracao=" + duracao + ", titulo=" + titulo + "]";
    }
    
}
