package Cinema.Repositorio;

import Cinema.Dominio.Ator;

import Cinema.Fakedb.AtorFakedb;

public class AtorRepositorio extends BaseRepositorio<AtorFakedb, Ator>{
    public AtorRepositorio(){
        this.db = new AtorFakedb();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Ator Create(Ator instancia) {
        int pos = this.dataset.size()-1;
        int codigo = this.dataset.get(pos).getCodigo()+1;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Ator Read(int codigo) {
        for(Ator ator : this.dataset){
            if(ator.getCodigo() == codigo)
            return ator;
        }
        return null;
    }

    @Override
    public Ator Update(Ator instancia) {
        Ator alt = this.Read(instancia.getCodigo());
        if(alt == null){
            return null;
        }
        else{
            alt.setCodigo(instancia.getCodigo());
            alt.setNome(instancia.getNome());
            alt.setPapelDoAtor(instancia.getPapelDoAtor());
            return alt;
        }
    }

    @Override
    public Ator Delete(int codigo) {
        Ator del = this.Read(codigo);
        if(del == null){
            return null;
        }
        else{
            this.dataset.remove(del);
            return del;
        }
    }

}
