package Cinema.Fakedb;

import Cinema.Dominio.Sessao;

public class SessaoFakedb extends BaseGenericaFakedb<Sessao>{
    public SessaoFakedb(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Sessao(0, null, null, null));
        this.tabela.add(new Sessao(0, null, null, null));
        this.tabela.add(new Sessao(0, null, null, null));
    }
    
}
