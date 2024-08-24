package Cinema.Dominio;

public class Filme extends BaseIdentificador{
    private String titulo;
    private int duracao;
    private String genero;
   
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Filme(String titulo, int duracao, String genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }
    @Override
    public String toString() {
        return "Filme [titulo=" + titulo + ", duracao=" + duracao + ", genero=" + genero + "]";
    }

    
}
