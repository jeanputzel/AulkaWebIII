
/**
 *Crie um programa que leia o nome e a idade digitada pelo usuário,
 *mais o valor do ingresso de cinema.
 *Se a pessoa for idosa (idade maior ou igual a 60),
 *pagará a metade do ingresso.
 */

import java.util.Scanner;

public class Cinema{
    
    public static void main (String args[]) {
        
        String nome;
        int idade;
        double valorDoIngresso;
                       
        Scanner ler = new Scanner (System.in);
        
        
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        System.out.println("Digite o valor do ingresso: ");
        valorDoIngresso = ler.nextDouble();
                                
        if(idade >= 60){
            System.out.println( "\n" +  "Desconto para idoso!" + (valorDoIngresso) / 2 + " reais" );
            
        }else{
            System.out.println("Você comprou um ingresso no valor de: " + valorDoIngresso + " reais");
        }
        
    }
}

