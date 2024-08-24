package Cinema.Repositorio;

import Cinema.Dominio.Filme;
import Cinema.Fakedb.FilmeFakedb;

public class FilmeRepositorio extends BaseGenericaRepositorio<FilmeFakedb, Filme>{
    public FilmeRepositorio(){
        this.db = new FilmeFakedb();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Filme Create(Filme instancia) {
        int pos = this.dataset.size()-1;
        int codigo = this.dataset.get(pos).getCodigo()+1;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Filme Read(int codigo) {
        for(Filme filme : this.dataset){
            if(filme.getCodigo() == codigo)
            return filme;
        }
        return null;
    }

    @Override
    public Filme Update(Filme instancia) {
        Filme alt = this.Read(instancia.getCodigo());
        if(alt == null){
            return null;
        }
        else{
            alt.setCodigo(instancia.getCodigo());
            alt.setDuracao(instancia.getDuracao());
            alt.setGenero(instancia.getGenero());
            alt.setTitulo(instancia.getTitulo());
            return alt;
        }
    }


    @Override
    public Filme Delete(int codigo) {
        Filme del = this.Read(codigo);
        if(del == null){
            return null;
        }
        else{
            this.dataset.remove(del);
            return del;
        }
    }
}
