package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Telefone telefone = new Telefone();
        String nome;
        String numero;

        System.out.println("Digite o nome e o número a serem adicionados:");
        nome = teclado.next();
        numero = teclado.next();

        if(telefone.add(nome,numero)){
            System.out.println("Dados corretos!");
        }

        else{
            System.out.println("Dados incorretos!");
        }
    }
}
