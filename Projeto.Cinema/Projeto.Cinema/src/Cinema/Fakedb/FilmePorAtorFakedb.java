package Cinema.Fakedb;

import Cinema.Dominio.FilmePorAtor;

public class FilmePorAtorFakedb extends BaseGenericaFakedb<FilmePorAtor>{
    public FilmePorAtorFakedb(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new FilmePorAtor(0, 0, 0));
        this.tabela.add(new FilmePorAtor(0, 0, 0));
        this.tabela.add(new FilmePorAtor(0, 0, 0));
        
    }
    
}
