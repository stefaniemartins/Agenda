package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Telefone telefone = new Telefone();
        String nome;
        String numero;

        nome = teclado.next();
        numero = teclado.next();

        telefone.add(nome,numero);

        nome = teclado.next();
        numero = teclado.next();

        telefone.add(nome,numero);

        System.out.println(telefone.toString());

        telefone.remove("casa");

        System.out.println(telefone.toString());

        telefone.update("celular", "048999419560");

        System.out.println(telefone.toString());
    }
}
