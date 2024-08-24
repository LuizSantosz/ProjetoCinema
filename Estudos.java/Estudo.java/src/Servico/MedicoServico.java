package Servico;

import java.util.ArrayList;

import Dominio.Medico;

import Repositorio.MedicoRepositorio;

public class MedicoServico extends BaseServico<MedicoRepositorio, Medico>{

    public MedicoServico(){
        
        this.repositorio = new MedicoRepositorio();
    }

    @Override
    public Medico Inserir(Medico tupla){
        return this.repositorio.Create(tupla);
    }

    @Override
    public Medico Obter(int codigo){
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Medico> Listar(){
        return this.repositorio.ReadAll();
    }

    @Override
    public Medico Atualizar(Medico tupla){
        return this.repositorio.Update(tupla);
    }

    @Override
    public Medico Excluir(int codigo){
        return this.repositorio.Delete(codigo);
    }
}