package Dominio;

import java.time.LocalDate;

import java.util.ArrayList;

public class Paciente extends BasePessoa{

    private String nomeMae;

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Paciente(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            Profissao profissao, Escolaridade escolaridade, ArrayList<Endereco> endereco, String nomeMae) {
        super(codigo, nome, email, rg, cpf, dataNascimento, profissao, escolaridade, endereco);
        this.nomeMae = nomeMae;
    }
}