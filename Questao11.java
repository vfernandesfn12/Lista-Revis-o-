/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao10;

    class Voo {
    private String numero;
    private int assentosDisponiveis;
    
    public Voo(String numero, int assentosDisponiveis) {
        this.numero = numero;
        this.assentosDisponiveis = assentosDisponiveis;
    }
    
    public void reservarAssento() {
        if (assentosDisponiveis > 0) {
            assentosDisponiveis--;
            System.out.println("Assento reservado com sucesso. Assentos disponíveis: "+assentosDisponiveis);
        } else {
            System.out.println("Não tem assentos disponíveis para reserva.");
        }
    }
    
    public int verificarDisponibilidade() {
        return assentosDisponiveis;
    }
}
   
     public class Questao11{

    public static void main(String[] args) {
        Voo voo = new Voo("AB123", 10);
        
        voo.reservarAssento();
        voo.reservarAssento();
        voo.reservarAssento();
        
        System.out.println("Assentos disponíveis no final: " +voo.verificarDisponibilidade());
    }

     }
