package Cinema.Repositorio;

import Cinema.Dominio.FilmePorAtor;

import Cinema.Fakedb.FilmePorAtorFakedb;

public class FilmePorAtorRepositorio extends BaseGenericaRepositorio<FilmePorAtorFakedb, FilmePorAtor>{
    public FilmePorAtorRepositorio(){
        this.db = new FilmePorAtorFakedb();
        this.dataset = this.db.getTabela();
    }

    @Override
    public FilmePorAtor Create(FilmePorAtor instancia) {
        int pos = this.dataset.size()-1;
        int codigo = this.dataset.get(pos).getCodigo()+1;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public FilmePorAtor Read(int codigo) {
         for(FilmePorAtor filmePorAtor : this.dataset){
            if(filmePorAtor.getCodigo() == codigo)
            return filmePorAtor;
        }
        return null;
    }

    @Override
    public FilmePorAtor Update(FilmePorAtor instancia) {
        FilmePorAtor alt = this.Read(instancia.getCodigo());
        if(alt == null){
            return null;
        }
        else{
            alt.setCodigo(instancia.getCodigo());
            alt.setCodigoAtor(instancia.getCodigoAtor());
            alt.setCodigoFilme(instancia.getCodigoFilme());
            return alt;
        }
    }

    @Override
    public FilmePorAtor Delete(int codigo) {
        FilmePorAtor del = this.Read(codigo);
        if(del == null){
            return null;
        }
        else{
            this.dataset.remove(del);
            return del;
        }
    }
    
}
