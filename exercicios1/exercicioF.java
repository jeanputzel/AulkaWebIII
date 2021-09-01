/**
   Faça um algoritmo que leia um valor inteiro e retorne se este valor é PAR ou ÍMPAR.
*/

//import a classe Scanner
import java.util.Scanner;

public class exercicioF {
    
    public static void main (String args[]){
        
        Scanner ler = new Scanner(System.in);
          
        int i=3;

        System.out.println("Digite um número: " + "\n");
        i = ler.nextInt();
        
        if(i % 2 == 0)
        System.out.println("É par !");
        
        else
        System.out.println("É impar!");
             
                               
        
    }
}

