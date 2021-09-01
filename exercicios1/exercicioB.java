/**
 *Faça um programa que leia três valores inteiros digitados pelo usuário e retorne o resultado da multiplicação desses valores.
 
*/


//import a classe Scanner
import java.util.Scanner;

public class exercicioB{
    
    public static void main(String args []) {
        
        Scanner ler = new Scanner(System.in);
        
        //declaração dos atributos   
        int valor1, valor2, valor3, resultado;
         
        
        System.out.println("Digite o valor 1: " + "\n");
        valor1 = ler.nextInt();
        
        System.out.println("Digite o valor 2: " + "\n");
        valor2 = ler.nextInt();
        
        System.out.println("Digite o valor 3: " + "\n");
        valor3 = ler.nextInt();
        
        
        System.out.println("o resultado dos valores é: " + (valor1 * valor2 * valor3));

        
    }
}
