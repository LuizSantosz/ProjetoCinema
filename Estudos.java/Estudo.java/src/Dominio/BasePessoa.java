package Dominio;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class BasePessoa extends BaseIdentificador{
    protected String nome;

    protected String email;

    protected String rg;

    protected String cpf;

    protected LocalDate dataNascimento;

    protected Profissao profissao;

    protected Escolaridade escolaridade;

    protected ArrayList<Endereco> endereco;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public Profissao getProfissao(){
        return profissao;
    }

    public void setProfissao(Profissao profissao){
        this.profissao = profissao;
    }

    public Escolaridade getEscolaridade(){
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade){
        this.escolaridade = escolaridade;
    }

    public ArrayList<Endereco> getEndereco(){
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco){
        this.endereco = endereco;
    }

    public BasePessoa(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento, Profissao profissao, Escolaridade escolaridade, ArrayList<Endereco> endereco){
        super(codigo);
        this.nome = nome;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
        this.escolaridade = escolaridade;
        this.endereco = endereco;
    }
}