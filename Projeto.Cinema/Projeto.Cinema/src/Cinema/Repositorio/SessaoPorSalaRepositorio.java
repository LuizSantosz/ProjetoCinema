package Cinema.Repositorio;

import Cinema.Dominio.SessaoPorSala;

import Cinema.Fakedb.SessaoPorSalaFakedb;

public class SessaoPorSalaRepositorio extends BaseGenericaRepositorio<SessaoPorSalaFakedb, SessaoPorSala>{
    public SessaoPorSalaRepositorio(){
        this.db = new SessaoPorSalaFakedb();
        this.dataset = this.db.getTabela(); 
    }

    @Override
    public SessaoPorSala Create(SessaoPorSala instancia) {
        int pos = this.dataset.size()-1;
        int codigo = this.dataset.get(pos).getCodigo()+1;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public SessaoPorSala Read(int codigo) {
        for(SessaoPorSala sessaoPorSala : this.dataset){
            if(sessaoPorSala.getCodigo() == codigo)
            return sessaoPorSala;
        }
        return null;
    }

    @Override
    public SessaoPorSala Update(SessaoPorSala instancia) {
         SessaoPorSala alt = this.Read(instancia.getCodigo());
        if(alt == null){
            return null;
        }
        else{
            alt.setCodigo(instancia.getCodigo());
            alt.setCodigoSala(instancia.getCodigoSala());
            alt.setCodigoSessao(instancia.getCodigoSessao());
            return alt;
        }
    }

    @Override
    public SessaoPorSala Delete(int codigo) {
        SessaoPorSala del = this.Read(codigo);
        if(del == null){
            return null;
        }
        else{
            this.dataset.remove(del);
            return del;
        }
    }
    
}
