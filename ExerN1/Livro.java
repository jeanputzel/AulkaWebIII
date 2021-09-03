/**
 * Criar um programa que leia quantos livros o usuário deseja comprar + o seu valor e ofereça desconto. Se o usuário for comprar mais de 5 livros, ele receberá um desconto de 50%, senão será o valor normal
   
*/

import java.util.Scanner;

public class Livro{
    
    public static void main (String args[]) {
        
        double valor;
        int quantidade;
        
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite quantos livros deseja comprar: ");
        quantidade = ler.nextInt();
        
        System.out.println("Digite o valor do livro: ");
        valor = ler.nextDouble();
        
        double total=valor * quantidade;
        
        System.out.println("O valor total da compra dos livros é de" + total);
        
        if(valor >= 5){
            System.out.println("O valor dos livros é" + (total - (total * 0.50)));
            
        }else{
            System.out.println("O valor dos livros é" + total);
        }
        
    }
}