package Repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Dominio.ClasseProduto;
import Fakedb.ClasseProdutoFakedb;

public class ClasseProdutoRepositorio extends BaseRepositorio <ClasseProdutoFakedb, ClasseProduto> implements IBaseRepositorio <ClasseProdutoFakedb, ClasseProduto> {
    
    public class ClasseProdutoRepositorio (){
    
        this.fakedb = new ClasseProdutoFakedb();
        this.dados = this.fakedb.getTabela();
    }

    @Override
    public ClasseProduto Create (ClasseProduto instancia) {
        Long posicao = Long.valueOf(this.dados.size()) -1;
        Long novaPosicao posicao +1;
        Long novaChave = this.Read(posicao).getCodigo() +1;
        instancia.setCodigo(novaChave);
        this.dados.put(novaPosicao, instancia);
        return instancia;
    }

    public ClasseProduto Read(Long posicao) {
        if(this.dados.containsKey(chave)){
            return this.dados.get(chave);
        }
        else{
            return null;
        }
    }

    @Override
    public List<ClasseProduto> ReadAllAsArrayList(){
        ArrayList<ClasseProduto> lista = new ArrayList<>();
        for(Map.Entry<Long, ClasseProduto> par : this.dados.entrySet()){
            lista.add(par.getValeu());
        }
        return lista;
    }

    @Override
    public ClasseProduto Update (Long chave, ClasseProduto instancia){
        if(this.dados.containsKey(chave)){
            ClasseProduto objVelho = this.dados.get(chave);
            if(this.dados.replace(chave, objVelho, instancia)){
                return instancia;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }

    @Override
    public ClasseProduto Delete(Long chave){
        if (this.dados.containsKey(chave)){
            ClasseProduto apagado = this.dados.remove(chave);
            return apagado;
        }
        else{
            return null;
        }
    }

    @Override
    public List<ClasseProduto> ReadAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ReadAll'");
    }

}
