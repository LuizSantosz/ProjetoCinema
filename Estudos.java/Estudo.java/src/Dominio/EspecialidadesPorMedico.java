package Dominio;

public class EspecialidadesPorMedico extends BaseIdentificador {

    private int codigoMedico;

    private int codigoEspecialista;

    public int getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public int getCodigoEspecialista() {
        return codigoEspecialista;
    }

    public void setCodigoEspecialista(int codigoEspecialista) {
        this.codigoEspecialista = codigoEspecialista;
    }
    
    public EspecialidadesPorMedico(int codigo, int codigoMedico, int codigoEspecialista) {
        super(codigo);
        this.codigoMedico = codigoMedico;
        this.codigoEspecialista = codigoEspecialista;
    }
}