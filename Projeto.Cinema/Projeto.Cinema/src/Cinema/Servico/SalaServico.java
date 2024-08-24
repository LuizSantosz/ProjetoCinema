package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Sala;

import Cinema.Repositorio.SalaRepositorio;

public class SalaServico extends BaseGenericaServico<SalaRepositorio, Sala>{
    public SalaServico(){
        this.repositorio = new SalaRepositorio();
    }

    @Override
    public Sala Inserir(Sala tupla) {
        return this.repositorio.Create(tupla);
    }

    @Override
    public Sala Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Sala> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Sala Atualizar(Sala tupla) {
        return this.repositorio.Update(tupla);
    }

    @Override
    public Sala Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }

}
