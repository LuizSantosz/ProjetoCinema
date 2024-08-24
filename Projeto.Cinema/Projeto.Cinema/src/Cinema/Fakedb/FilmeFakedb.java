package Cinema.Fakedb;

import Cinema.Dominio.Filme;

public class FilmeFakedb extends BaseGenericaFakedb<Filme>{
    public FilmeFakedb(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Filme(0, null, 0, null));
        this.tabela.add(new Filme(0, null, 0, null));
        this.tabela.add(new Filme(0, null, 0, null));
        
    }
    
}
