import Dominio.Medico;

import Servico.MedicoServico;

public class App {
    public static void main(String[] args) throws Exception {
        MedicoServico serv = new MedicoServico();
        for (Medico medico : serv.Listar()){
            System.out.println(medico.toString());
        }
    }
}