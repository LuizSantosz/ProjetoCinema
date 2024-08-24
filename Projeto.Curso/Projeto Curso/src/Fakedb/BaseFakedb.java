package Fakedb;

import java.util.HashMap;


public abstract class BaseFakedb <TDominio>{
    protected HashMap<Long, TDominio> tabela;

    public abstract HashMap<Long, TDominio> getTabela();

    public BaseFakedb(){
        this.tabela = new HashMap<>();
        this.CarregarDados();
    }

    protected abstract void CarregarDados();
}
