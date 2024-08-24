package Cinema.Dominio;

public abstract class BaseIdentificador {
    protected int codigo;

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

}
