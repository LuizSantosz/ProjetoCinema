package Dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends BasePessoa {
    
    private static final String Profissao = null;
    private static final String Escolaridade = null;
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    

    public Medico(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            Profissao profissao, Escolaridade escolaridade, ArrayList<Endereco> endereco, String matricula) {
        super(codigo, nome, email, rg, cpf, dataNascimento, profissao, escolaridade, endereco);
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        String mensagem = "";
        mensagem += "---------------------------------------------------------\n";
        mensagem += "BaseIdentificador [codigo = "+ codigo +"] \n";
        mensagem += "Medico[Matricula = "+ matricula +"]\n";
        return mensagem += "BasePessoa [nome = "+ nome + ", email = " + email + ", rg = "+ rg + ", cpf = "+ cpf +", dataNascimento = "+ dataNascimento +", Profissao = "+ Profissao +", Escolaridade = "+ Escolaridade +"] \n";
    }
}