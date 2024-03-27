package classes;

import java.util.Scanner;

public class UsuarioVip extends Usuario{
    private String tipoUsuario;
    private int prazoVip;
    public UsuarioVip(String usuario, String senha, String nome, String telefone, String email, String tipoUsuario, int prazoVip) {
        super(usuario, senha, nome, telefone, email);
        this.tipoUsuario = "Vip";
        this.prazoVip = prazoVip;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getPrazoVip() {
        return prazoVip;
    }

    public void setPrazoVip(int prazoVip) {
        this.prazoVip = prazoVip;
    }


    @Override
    public void cadastrarUsuario(){
        Scanner sc = new Scanner(System.in);
        super.cadastrarUsuario();
        System.out.println("Informe o prazo: ");
        prazoVip = sc.nextInt();
        System.out.println("Tipo da conta: " + tipoUsuario);
    }

    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Tipo da Conta: " + tipoUsuario);
    }

    @Override
    public int getPrazo(){
        return prazoVip;
    }
}
