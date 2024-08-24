package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Filme;

import Cinema.Repositorio.FilmeRepositorio;

public class FilmeServico extends BaseGenericaServico<FilmeRepositorio, Filme>{
    public FilmeServico(){
        this.repositorio = new FilmeRepositorio();
    }

    @Override
    public Filme Inserir(Filme tupla) {
        return this.repositorio.Create(tupla);
    }

    @Override
    public Filme Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Filme> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Filme Atualizar(Filme tupla) {
        return this.repositorio.Update(tupla);
    }

    @Override
    public Filme Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }
    
}
