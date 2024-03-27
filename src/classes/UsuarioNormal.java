package classes;

import java.util.Scanner;

public class UsuarioNormal extends Usuario{
    private String tipoUsuario;
    private int prazoNormal;

    public UsuarioNormal(String usuario, String senha, String nome, String telefone, String email, String tipoUsuario,int prazoNormal) {
        super(usuario, senha, nome, telefone, email);
        this.tipoUsuario = "Normal";
        this.prazoNormal = prazoNormal;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getPrazoNormal() {
        return prazoNormal;
    }

    public void setPrazoNormal(int prazoNormal) {
        this.prazoNormal = prazoNormal;
    }

    @Override
    public void cadastrarUsuario(){
        Scanner sc = new Scanner(System.in);
        super.cadastrarUsuario();
        System.out.println("Informe o prazo noraml: ");
        prazoNormal = sc.nextInt();
        System.out.println("Tipo da conta: " + tipoUsuario);
    }

    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Tipo da Conta: " + tipoUsuario);
    }

    @Override
    public int getPrazo(){
        return prazoNormal;
    }
}
