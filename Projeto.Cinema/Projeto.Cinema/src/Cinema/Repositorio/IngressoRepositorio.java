package Cinema.Repositorio;

import Cinema.Dominio.Ingresso;

import Cinema.Fakedb.IngressoFakedb;

public class IngressoRepositorio extends BaseGenericaRepositorio<IngressoFakedb, Ingresso>{
    public IngressoRepositorio(){
        this.db = new IngressoFakedb();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Ingresso Create(Ingresso instancia) {
        int pos = this.dataset.size()-1;
        int codigo = this.dataset.get(pos).getCodigo()+1;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Ingresso Read(int codigo) {
        for(Ingresso ingresso : this.dataset){
            if(ingresso.getCodigo() == codigo)
            return ingresso;
        }
        return null;
    }

    @Override
    public Ingresso Update(Ingresso instancia) {
        Ingresso alt = this.Read(instancia.getCodigo());
        if(alt == null){
            return null;
        }
        else{
            alt.setCategoria(instancia.getCategoria());
            alt.setCodigo(instancia.getCodigo());
            alt.setTipo(instancia.getTipo());
            return alt;
        }
    }

    @Override
    public Ingresso Delete(int codigo) {
        Ingresso del = this.Read(codigo);
        if(del == null){
            return null;
        }
        else{
            this.dataset.remove(del);
            return del;
        }
    }
}
