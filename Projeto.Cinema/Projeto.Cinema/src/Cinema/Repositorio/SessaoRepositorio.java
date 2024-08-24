package Cinema.Repositorio;

import Cinema.Dominio.Sessao;

import Cinema.Fakedb.SessaoFakedb;

public class SessaoRepositorio extends BaseGenericaRepositorio<SessaoFakedb, Sessao>{
    public SessaoRepositorio(){
        this.db = new SessaoFakedb();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Sessao Create(Sessao instancia) {
        int pos = this.dataset.size()-1;
        int codigo = this.dataset.get(pos).getCodigo()+1;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Sessao Read(int codigo) {
        for(Sessao sessao : this.dataset){
            if(sessao.getCodigo() == codigo)
            return sessao;
        }
        return null;
    }

    @Override
    public Sessao Update(Sessao instancia) {
        Sessao alt = this.Read(instancia.getCodigo());
        if(alt == null){
            return null;
        }
        else{
            alt.setCodigo(instancia.getCodigo());
            alt.setData(instancia.getData());
            alt.setHorario(instancia.getHorario());
            alt.setStatusDaSessao(instancia.getStatusDaSessao());
            return alt;
        }
    }

    @Override
    public Sessao Delete(int codigo) {
        Sessao del = this.Read(codigo);
        if(del == null){
            return null;
        }
        else{
            this.dataset.remove(del);
            return del;
        }
    }
    
}
