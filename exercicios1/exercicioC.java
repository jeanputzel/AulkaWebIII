/**
   * Faça um programa que leia uma variável real "A" digitada pelo usuário e apresente o resultado dos seguintes cálculos:
 o dobro de "A"
 o triplo do dobro de "A"
 a metade do triplo do dobro de "A"
 o quadrado da variável "A" - Math.pow(número, potência);
 a quinta parte do dobro de "A"

*/

//import a classe Scanner
import java.util.Scanner;

public class exercicioC {
    
    public static void main (String args[]){
        
        Scanner ler = new Scanner(System.in);
        
        double valor;
        
        System.out.println("Digite um valor: " + "\n");
        valor = ler.nextDouble();
        
        System.out.println("O dobro do valor é: " + (valor * 2));
        
        System.out.println("O triplo do dobro deste valor é: " + ((valor * 2) * 3));
        
        System.out.println("A metade do triplo do dobro deste valor é: " + ((valor * 2) * 3) /2);
        
        System.out.println("O quadrado da variável deste valor é: " + Math.pow(valor, 2));
        
        System.out.println("A quinta parte do dobro deste valor é: " + (valor * 2) / 5);
        
        
    }
}