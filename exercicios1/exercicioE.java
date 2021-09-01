/**
 *Faça um algoritmo que leia um valor inteiro e informe se este valor é maior do que 10 ou não.

*/


//import a classe Scanner
import java.util.Scanner;

public class exercicioE{
    
    public static void main(String args []) {
        
        Scanner ler = new Scanner(System.in);
        
        //declaração dos atributos   
        int valor; 
        
        System.out.println("Digite o valor : " + "\n");
        valor = ler.nextInt();
 
        
        System.out.println("Este valor é: " + (valor>10) + " maior que 10!");
        System.out.println("Este valor é: " + (valor<10) + " menor que 10!");

        
    }
}
