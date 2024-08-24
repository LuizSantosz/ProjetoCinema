package Cinema.Repositorio;

import Cinema.Dominio.Sala;

import Cinema.Fakedb.SalaFakedb;

public class SalaRepositorio extends BaseGenericaRepositorio<SalaFakedb, Sala>{
    public SalaRepositorio(){
       this.db = new SalaFakedb();
        this.dataset = this.db.getTabela(); 
    }

    @Override
    public Sala Create(Sala instancia) {
        int pos = this.dataset.size()-1;
        int codigo = this.dataset.get(pos).getCodigo()+1;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Sala Read(int codigo) {
        for(Sala sala : this.dataset){
            if(sala.getCodigo() == codigo)
            return sala;
        }
        return null;
    }

    @Override
    public Sala Update(Sala instancia) {
        Sala alt = this.Read(instancia.getCodigo());
        if(alt == null){
            return null;
        }
        else{
            alt.setCodigo(instancia.getCodigo());
            alt.setLocalizacao(instancia.getLocalizacao());
            alt.setNumAssentos(instancia.getNumAssentos());
            alt.setTipoTela(instancia.getTipoTela());
            return alt;
        }
    }

    @Override
    public Sala Delete(int codigo) {
        Sala del = this.Read(codigo);
        if(del == null){
            return null;
        }
        else{
            this.dataset.remove(del);
            return del;
        }
    }

}
