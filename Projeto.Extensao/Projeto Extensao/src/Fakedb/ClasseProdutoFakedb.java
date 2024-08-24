package Fakedb;

import java.time.LocalDate;
import java.util.HashMap;

import Dominio.ClasseProduto;

public class ClasseProdutoFakedb extends BaseFakedb <ClasseProduto>{

    @Override
    public HashMap<Long, ClasseProduto> getTabela(){
        if(this.tabela == null){
            this.tabela = new HashMap<>();
            this.CarregarDados();
        }
        return this.tabela;
    }

    public ClasseProdutoFakedb(){
        super();
    }

    @Override
    protected void CarregarDados(){
        this.tabela.put(1L, new ClasseProduto(1025, "PS5", LocalDate.now()));
    }
}