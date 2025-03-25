/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.iniciojava.mavenproject2;

import java.util.Scanner;

class Cinema {
    int capacidade;
    int ingressosVendidos;

    public Cinema(int capacidade, int ingressosVendidos) {
        this.capacidade = capacidade;
        this.ingressosVendidos = ingressosVendidos;
    }

    public void venderIngresso(int quantidade, int ingressosVendidos) {
        if (this.ingressosVendidos + quantidade <= this.capacidade) {
            this.ingressosVendidos += quantidade;
            System.out.println(quantidade + " ingressos vendidos com sucesso.");
        } else {
            System.out.println("Não há ingressos disponíveis.");
        }
    }

    public void verificarDisponibilidade() {
        int disponibilidade = this.capacidade - this.ingressosVendidos;
        System.out.println("Ingressos disponíveis: " + disponibilidade);
    }
}

public class Mavenproject2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a capacidade do cinema: ");
        int capacidade = leia.nextInt();

        System.out.println("Digite a quantidade de ingressos vendidos inicialmente: ");
        int ingressosVendidos = leia.nextInt();

        Cinema cine = new Cinema(capacidade, ingressosVendidos);

        System.out.println("Digite a quantidade de ingressos a vender: ");
        int quantidade = leia.nextInt();

        cine.venderIngresso(quantidade, ingressosVendidos);
        cine.verificarDisponibilidade();

        leia.close();
    }
}