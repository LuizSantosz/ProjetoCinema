package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Sessao;
import Cinema.Repositorio.SessaoRepositorio;

public class SessaoServico extends BaseGenericaServico<SessaoRepositorio, Sessao>{
    public SessaoServico(){
        this.repositorio = new SessaoRepositorio();
    }

    @Override
    public Sessao Inserir(Sessao tupla) {
        return this.repositorio.Create(tupla);
    }

    @Override
    public Sessao Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Sessao> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Sessao Atualizar(Sessao tupla) {
        return this.repositorio.Update(tupla);
    }

    @Override
    public Sessao Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }

}
