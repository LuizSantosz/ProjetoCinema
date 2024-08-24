package Fakedb;

import java.time.LocalDate;

import Dominio.Medico;

public class MedicoFakedb extends BaseFakedb<Medico> {

    public MedicoFakedb(){
        super();
    }
        @Override
        protected void CarregarDados(){
            this.tabela.add(new Medico(1, "Jesus", "jesus@clinica.com", "123", "456", LocalDate.of(1984, 6, 24), null, null, null, "123abc"));
            this.tabela.add(new Medico(2, "Pedro", "pedro@clinica.com", "124", "455", LocalDate.of(1984, 5, 24), null, null, null, "124abc"));
            this.tabela.add(new Medico(3, "Lucas", "lucas@clinica.com", "125", "454", LocalDate.of(1984, 7, 24), null, null, null, "125abc"));
            this.tabela.add(new Medico(4, "Paulo", "paulo@clinica.com", "126", "453", LocalDate.of(1984, 4, 24), null, null, null, "126abc"));
            this.tabela.add(new Medico(5, "Mateus", "mateus@clinica.com", "127", "452", LocalDate.of(1984, 8, 24), null, null, null, "127abc"));
    }
}