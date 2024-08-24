package Cinema.Fakedb;

import Cinema.Dominio.Ingresso;

public class IngressoFakedb extends BaseGenericaFakedb<Ingresso>{
    public IngressoFakedb(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Ingresso(0, null, null));
        this.tabela.add(new Ingresso(0, null, null));
        this.tabela.add(new Ingresso(0, null, null));
        
    }

}
