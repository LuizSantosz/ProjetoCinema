package Fakedb;

import java.time.LocalDate;
import java.util.HashMap;

import Dominio.ClasseProduto;

public class ClasseProdutoFakedb extends BaseFakedb<ClasseProduto>{

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
        this.tabela.put(1L, new ClasseProduto(1510L, "PC GAMER", LocalDate.now()));
        this.tabela.put(2L, new ClasseProduto(1525L, "PS5", LocalDate.now()));
        this.tabela.put(3L, new ClasseProduto(1634L, "CARRO GAMER", LocalDate.now()));
        this.tabela.put(4L, new ClasseProduto(1642L, "VIAGEM GAMER", LocalDate.now()));
        
    }

}
