package Cinema.Dominio;

import java.util.Date;

public class Sessao extends BaseIdentificador{
    private String statusDaSessao;
    private Date data;
    private Date horario;
    public String getStatusDaSessao() {
        return statusDaSessao;
    }
    public void setStatusDaSessao(String statusDaSessao) {
        this.statusDaSessao = statusDaSessao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Date getHorario() {
        return horario;
    }
    public void setHorario(Date horario) {
        this.horario = horario;
    }
    public Sessao(int codigo, String statusDaSessao, Date data, Date horario) {
        super(codigo);
        this.statusDaSessao = statusDaSessao;
        this.data = data;
        this.horario = horario;
    }
    @Override
    public String toString() {
        return "Sessao [codigo=" + codigo + "statusDaSessao=" + statusDaSessao + ", data=" + data + ", horario=" + horario + "]";
    }

}
