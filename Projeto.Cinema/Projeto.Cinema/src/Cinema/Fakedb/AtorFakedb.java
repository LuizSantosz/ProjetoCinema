package Cinema.Fakedb;

import Cinema.Dominio.Ator;

public class AtorFakedb extends BaseGenericaFakedb<Ator>{
    public AtorFakedb(){
        super();
    }

    @Override
    protected void CarregarDados(){
        this.tabela.add(new Ator ( 1,  "Luiz",  "Principal"));
        this.tabela.add(new Ator ( 2,  "Leonam",  "Secundario"));
        this.tabela.add(new Ator ( 3,  "Khalel",  "Coadjuvante"));
    }
    
}
