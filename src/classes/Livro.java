package classes;

import java.util.Scanner;

public class Livro {
    private String codigo;
    private String nome;
    private String autor;
    private String descricao;

    public Livro(String codigo, String nome, String autor, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public void cadastrarLivro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Cadastrar livro------------");
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Autor: ");
        autor = sc.nextLine();
        System.out.println("Descricao: ");
        descricao = sc.nextLine();
        System.out.println("Isbn: ");
        codigo = sc.nextLine();
    }

    public void imprimirLivros(){
        System.out.println("------------Dados dos Livros------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Autor: " + autor);
        System.out.println("Descricao: " + descricao);
        System.out.println("ISBN: " + codigo);
    }

}
