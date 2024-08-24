package Cinema.Fakedb;

import Cinema.Dominio.Filme;

public class FilmeFakedb extends BaseFakedb<Filme>{
    public FilmeFakedb(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Filme("O indomavel", 2, "Luta"));
        
    }
    
}
