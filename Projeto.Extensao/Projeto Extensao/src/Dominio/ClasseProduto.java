package Dominio;

import java.time.LocalDate;

public class ClasseProduto extends BaseDominio {
    private String nome;
    private LocalDate dataDeInclusao;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataDeInsercao(){
        return dataDeInclusao;
    }

    public void setDataDeInsercao(LocalDate dataDeInsercao){
        this.dataDeInclusao = dataDeInsercao;
    }

    public ClasseProduto(long codigo, String nome, LocalDate dataDeInsercao){
        super(codigo);
        this.nome = nome;
        this.dataDeInclusao = dataDeInsercao;
    }

    public ClasseProduto now() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'now'");
    }
}
