/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author aluno
 */
    class ContaCorrente {
    private String titular;
    private double saldo;
    
    public ContaCorrente(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" +valor+ " realizado. Saldo atual:R$" +saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" +valor+ " realizado. Saldo atual: R$ "+saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    
    public void aplicarTaxaMensal() {
        if (saldo >= 12) {
            saldo -= 12;
            System.out.println("Taxa mensal de R$12 aplicada. Saldo atual: R$ "+saldo);
        } else {
            System.out.println("Saldo insuficiente para aplicar a taxa mensal.");
        }
    }

    
    public void exibirSaldo() {
        System.out.println("Titular: "+titular+" Saldo: R$ "+saldo);
    }
    }
    
    public class Mavenproject1{
    
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("João Silva", 100.0);
        conta.exibirSaldo();
        conta.depositar(50.0);
        conta.sacar(30.0);
        conta.aplicarTaxaMensal();
        conta.exibirSaldo();
    }
}
    