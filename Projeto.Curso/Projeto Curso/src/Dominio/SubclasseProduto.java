package Dominio;

import java.time.LocalDate;

public class SubclasseProduto extends BaseDominio{

    private Long codigoSubclasse;
    private String nome;
    private LocalDate dataDeInclusao;

    public Long getcodigoSubclasse(){
        return codigoSubclasse;
    }

    public void setCodigoSubclasse(Long codigoSubclasse){
        this.codigoSubclasse = codigoSubclasse;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public LocalDate getdataDeInclusao(){
        return dataDeInclusao;
    }

    public void setdataDeInclusao(LocalDate dataDeInclusao){
        this.dataDeInclusao = dataDeInclusao;
    }

    public SubclasseProduto(Long codigo,Long codigoSubclasse, String nome, LocalDate dataDeInclusao){
        super(codigo);
        this.codigo = codigo;
        this.nome = nome;
        this.dataDeInclusao = dataDeInclusao;
    }
}