package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.SessaoPorSala;
import Cinema.Repositorio.SessaoPorSalaRepositorio;

public class SessaoPorSalaServico extends BaseGenericaServico<SessaoPorSalaRepositorio, SessaoPorSala>{
    public SessaoPorSalaServico(){
        this.repositorio = new SessaoPorSalaRepositorio();
    }

    @Override
    public SessaoPorSala Inserir(SessaoPorSala tupla) {
        return this.repositorio.Create(tupla);
    }

    @Override
    public SessaoPorSala Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<SessaoPorSala> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public SessaoPorSala Atualizar(SessaoPorSala tupla) {
        return this.repositorio.Update(tupla);
    }

    @Override
    public SessaoPorSala Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }
    
}
