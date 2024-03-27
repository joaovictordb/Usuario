package classes;

import java.util.Date;

public class Reserva {
    private Date dataCadastro;

    public Reserva(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
