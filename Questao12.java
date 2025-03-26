
package com.mycompany.questao12;


    class Filme {
    private String titulo;
    private double notaTotal;
    private int quantidadeAvaliacoes;
    
    public Filme(String titulo) {
        this.titulo = titulo;
        this.notaTotal = 0;
        this.quantidadeAvaliacoes = 0;
    }
    
    public void avaliar(double nota) {
        if (nota >= 0 && nota <= 10) {
            notaTotal += nota;
            quantidadeAvaliacoes++;
            System.out.println("Avaliação registrada: "+nota);
        } else {
            System.out.println("Nota invalida. Insira uma nota entre 0 e 10.");
        }
    }
    
    public double calcularMedia() {
        if (quantidadeAvaliacoes == 0) {
            return 0;
        }
        return notaTotal / quantidadeAvaliacoes;
    }
}
    
    public class Questao12{
    
    public static void main(String[] args) {
        Filme filme = new Filme("O Poderoso Chefão");
        
        filme.avaliar(9.5);
        filme.avaliar(8.0);
        filme.avaliar(10.0);
        
        System.out.println("Média das avaliações: " +filme.calcularMedia());
    }
}

