/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.iniciojava.mavenproject3;

import java.util.Scanner;

class Livro {
    String titulo;
    String autor;
    boolean emprestado = false;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro foi emprestado.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro foi devolvido.");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }
}

public class Mavenproject3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o título do livro: ");
        String titulo = leia.nextLine();

        System.out.println("Digite o autor do livro: ");
        String autor = leia.nextLine();

        Livro livro = new Livro(titulo, autor);

        livro.emprestar();
        livro.devolver();

        leia.close();
    }
}
