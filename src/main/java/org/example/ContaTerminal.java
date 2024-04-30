package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        double saldoConta;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite sua agencia: ");
        agenciaConta = sc.next();

        System.out.println("Por favor, digite o numero da sua conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite seu saldo inicial: ");
        saldoConta = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta +" e seu saldo " + saldoConta + " já está disponível para saque.");
    }
}