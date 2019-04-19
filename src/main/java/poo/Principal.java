package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Telefone telefone = new Telefone();
        Email email = new Email();
        String nome;
        String texto;

        nome = teclado.next();
        texto = teclado.next();
//
//        telefone.add(nome,texto);
//
//        nome = teclado.next();
//        texto = teclado.next();
//
//        telefone.add(nome,texto);
//
//        System.out.println(telefone.toString());
//
//        telefone.remove("casa");
//
//        System.out.println(telefone.toString());
//
//        telefone.update("celular", "048999419560");
//
//        System.out.println(telefone.toString());

        email.add(nome, texto);

        nome = teclado.next();
        texto = teclado.next();

        email.add(nome, texto);
        System.out.println(email.toString());

        email.remove("pessoal");

        System.out.println(email.toString());

        email.update("empresarial","stefanie@outlook.com");

        System.out.println(email.toString());
    }
}
