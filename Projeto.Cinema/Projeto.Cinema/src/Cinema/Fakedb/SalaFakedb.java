package Cinema.Fakedb;

import Cinema.Dominio.Sala;

public class SalaFakedb extends BaseGenericaFakedb<Sala>{
    public SalaFakedb(){
        super();
    }

    @Override
    protected void CarregarDados(){
        this.tabela.add(new Sala(0, 0, null, null));
        this.tabela.add(new Sala(0, 0, null, null));
        this.tabela.add(new Sala(0, 0, null, null));
    }
    
}
