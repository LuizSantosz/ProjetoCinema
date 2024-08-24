package Repositorio;

import Dominio.Medico;

import Fakedb.MedicoFakedb;

public class MedicoRepositorio extends BaseRepositorio<MedicoFakedb, Medico>{
    public MedicoRepositorio(){
        this.db = new MedicoFakedb();
        this.dataset = this.db.getTabela();
    }
    @Override
    public Medico Create (Medico instancia){
        int tamanho = this.dataset.size();
        int posicao = tamanho --;
        int codigo = this.dataset.get(posicao).getCodigo();
        codigo = codigo ++;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Medico Read (int codigo){
        for (Medico medico : this.dataset){
            if (medico.getCodigo() == codigo){
                return medico;
            }
        }
        return null;
    }

    @Override
    public Medico Update(Medico instancia){
        Medico alt = this.Read(instancia.getCodigo());
            if(alt == null){
                return null;
            }
            else{
                alt.setCodigo(instancia.getCodigo());
                alt.setCpf(instancia.getCpf());
                alt.setDataNascimento(instancia.getDataNascimento());
                alt.setEmail(instancia.getEmail());
                alt.setMatricula(instancia.getMatricula());
                alt.setNome(instancia.getNome());
                alt.setRg(instancia.getRg());
            }
            return alt;
    }

    @Override
    public Medico Delete(int codigo){
        Medico del = this.Read(codigo);
        if(del == null){
            return null;
        }
        else{
            this.dataset.remove(del);
            return del;
        }
    }
}