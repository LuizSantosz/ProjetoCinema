package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Ator;
import Cinema.Repositorio.AtorRepositorio;

public class AtorServico extends BaseGenericaServico<AtorRepositorio, Ator>{
    public AtorServico(){
        this.repositorio = new AtorRepositorio();
    }

    @Override
    public Ator Inserir(Ator tupla) {
        return this.repositorio.Create(tupla);
    }

    @Override
    public Ator Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Ator> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Ator Atualizar(Ator tupla) {
        return this.repositorio.Update(tupla);
    }

    @Override
    public Ator Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }
    
}
