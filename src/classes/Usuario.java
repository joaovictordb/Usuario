package classes;

import java.util.Scanner;

public class Usuario {
    private String usuario;
    private String senha;
    private String nome;
    private String telefone;
    private String email;

    public Usuario(String usuario, String senha, String nome, String telefone, String email) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    /*public void setSenha(String senha) {
        this.senha = senha;
    }*/

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void cadastrarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Cadastro do Usuario-------------");
        System.out.println("usuario: ");
        usuario = sc.nextLine();
        System.out.println("Senha: ");
        senha = sc.nextLine();
        System.out.println("email: ");
        email = sc.nextLine();
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Telefone: ");
        telefone = sc.nextLine();
    }

    public void imprimirDados(){
        System.out.println("-----------Dados do Usuario----------");
        System.out.println("Usuario: "+ usuario);
        System.out.println("Email: " + email);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }

    public int getPrazo(){
        return 0;
    }
}
