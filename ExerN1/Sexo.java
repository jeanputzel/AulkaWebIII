
/**
 *Elabore um algoritmo que leia do teclado o sexo de uma pessoa.  
 *Se o sexo digitado for M ou F, 
 *escrever na tela “Sexo Masculino ou Feminino!”.  
 *Caso contrário, informar “Terceiro Sexo!”.
 */

import java.util.Scanner;

public class Sexo{
    
    public static void main (String args[]) {
        
    Scanner ler = new Scanner (System.in);
      int sexo; 
     
      System.out.println("Qual o seu sexo: " + "\n"
                          + "1 - Masculino" + "\n" 
                          + "2 - Feminino" + "\n" 
                          + "3 - Outros");
      sexo = ler.nextInt();  
                                                 
    if(sexo == 1){             
        System.out.println("O seu sexo é MASCULINO ");
        
    }else if(sexo == 2){     
        System.out.println("O seu sexo é fEMININO ");  
        
        }else{
        System.out.println("Outro sexo!!! "); 
        }
    }
}

