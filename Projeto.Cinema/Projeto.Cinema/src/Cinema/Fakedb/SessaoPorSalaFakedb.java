package Cinema.Fakedb;

import Cinema.Dominio.SessaoPorSala;

public class SessaoPorSalaFakedb extends BaseGenericaFakedb<SessaoPorSala>{
    public SessaoPorSalaFakedb(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new SessaoPorSala(0, 0, 0));
        this.tabela.add(new SessaoPorSala(0, 0, 0));
        this.tabela.add(new SessaoPorSala(0, 0, 0));
        
    }
    
}
