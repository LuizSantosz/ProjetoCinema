package Cinema.Fakedb;

import Cinema.Dominio.Ator;

public class AtorFakedb extends BaseFakedb<Ator>{
    
    public AtorFakedb(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Ator("luizao", "Principal"));
    }
}
