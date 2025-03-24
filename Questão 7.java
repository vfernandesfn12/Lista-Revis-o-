
package com.mycompany.mavenproject3;

import java.util.Scanner;

class Produto{
    String nome;
    double preco;
    
    
    

public Produto(String nome, double preco){
    
    this.nome = nome;
    this.preco = preco;

}

public void aplicarDesconto(){
    
     double totalDesconto = preco * 0.15;
     double desconto = preco - totalDesconto;
     double precoOG = preco;
     
     System.out.println("O produto com desconto fica no valor: R$"+desconto+" O valor antigo do produto sem o desconto é: "+precoOG);
     System.out.println("O total do desconto foi: "+totalDesconto+"%");
    
}

}

public class Mavenproject3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
    
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        
        Produto prod = new Produto(nome, preco);
        prod.aplicarDesconto();
        
        
    }
}
