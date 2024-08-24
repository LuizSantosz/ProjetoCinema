import Cinema.Dominio.Ator;
import Cinema.Servico.AtorServico;

public class App {
    public static void main(String[] args) throws Exception {
        AtorServico serv = new AtorServico();
        for(Ator ator : serv.Listar()){
            System.out.println(ator.toString());
        }
    }
}
