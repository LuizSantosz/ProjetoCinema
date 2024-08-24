package Dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Responsavel extends BasePessoa {
    private String relacionamento;

    public String getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    public Responsavel(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            Profissao profissao, Escolaridade escolaridade, ArrayList<Endereco> endereco, String relacionamento) {
        super(codigo, nome, email, rg, cpf, dataNascimento, profissao, escolaridade, endereco);
        this.relacionamento = relacionamento;
    }
}
