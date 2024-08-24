package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.FilmePorAtor;
import Cinema.Repositorio.FilmePorAtorRepositorio;

public class FilmePorAtorServico extends BaseGenericaServico<FilmePorAtorRepositorio, FilmePorAtor>{
    public FilmePorAtorServico(){
        this.repositorio = new FilmePorAtorRepositorio();
    }

    @Override
    public FilmePorAtor Inserir(FilmePorAtor tupla) {
        return this.repositorio.Create(tupla);
    }

    @Override
    public FilmePorAtor Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<FilmePorAtor> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public FilmePorAtor Atualizar(FilmePorAtor tupla) {
        return this.repositorio.Update(tupla);
    }

    @Override
    public FilmePorAtor Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }

    
    
}
