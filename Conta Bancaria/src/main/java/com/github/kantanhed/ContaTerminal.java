package com.github.kantanhed;

import java.util.Scanner;

public class ContaTerminal {

    public void imprimir() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();

        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite seu saldo !");
        double saldo = sc.nextDouble();


        System.out.println(("Olá "+nomeCliente+", "+
                "obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ agencia+", conta "+numero+
                " e seu saldo "+saldo+" já está disponível para saque"));

    }
}
