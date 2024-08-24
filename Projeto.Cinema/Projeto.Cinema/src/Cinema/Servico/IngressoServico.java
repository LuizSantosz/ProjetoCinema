package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Ingresso;
import Cinema.Repositorio.IngressoRepositorio;

public class IngressoServico extends BaseGenericaServico<IngressoRepositorio, Ingresso>{
    public IngressoServico(){
        this.repositorio = new IngressoRepositorio();
    }

    @Override
    public Ingresso Inserir(Ingresso tupla) {
        return this.repositorio.Create(tupla);
    }

    @Override
    public Ingresso Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Ingresso> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Ingresso Atualizar(Ingresso tupla) {
        return this.repositorio.Update(tupla);
    }

    @Override
    public Ingresso Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }

    

}
