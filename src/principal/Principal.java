package principal;

import classes.Livro;
import classes.UsuarioNormal;
import classes.UsuarioVip;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        boolean cadastroUsuario = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("deseja cadastrar um novo usuario?(s/n)");
        String resp = sc.nextLine().toLowerCase();
        cadastroUsuario = resp.equals("s");
        if (cadastroUsuario){
            System.out.println("voce deseja ser cliente normal ou vip?(n/v) ");
            String usuarioResp = sc.nextLine().toLowerCase();
            if (usuarioResp.equals("n")){
                UsuarioNormal usuarioNormal = new UsuarioNormal("","","","","","", 0) ;
                usuarioNormal.cadastrarUsuario();

                System.out.println("\n deseja cadastrar um livro?(s/n) ");
                String respLivro = sc.nextLine().toLowerCase();
                if (respLivro.equals("s")){
                    Livro livro = new Livro("","","","");
                    livro.cadastrarLivro();
                    livro.imprimirLivros();
                    System.out.println("Prazo de entrega do livro: " + usuarioNormal.getPrazo());
                }
                usuarioNormal.imprimirDados();

            }else if (usuarioResp.equals("v")){
                UsuarioVip usuarioVip = new UsuarioVip("","","","","","", 0);
                usuarioVip.cadastrarUsuario();

                System.out.println("deseja cadastrar um livro?(s/n) ");
                String respLivro = sc.nextLine().toLowerCase();
                if (respLivro.equals("s")){
                    Livro livro = new Livro("","","","");
                    livro.cadastrarLivro();
                    livro.imprimirLivros();
                    System.out.println("Prazo de entrega do livro: " + usuarioVip.getPrazo());
                }
                usuarioVip.imprimirDados();
            }
        }
    }
}
