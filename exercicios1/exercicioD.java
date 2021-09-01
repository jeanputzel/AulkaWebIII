/**
   Crie um programa que leia o nome e os valores digitados de duas notas de um aluno e 
   calcule a sua média de acordo com a fórmula abaixo:
   Media = nota1 + nota2 multiplicado por 2 e dividido por 3.
*/

//import a classe Scanner
import java.util.Scanner;

public class exercicioD {
    
    public static void main (String args[]){
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        float n1, n2, media;
        
        System.out.println("Digite o nome do aluno: " + "\n");
        nome = ler.next();
        
        System.out.println("Digite a sua nota da N1: " + "\n");
        n1 = ler.nextFloat();
        
        System.out.println("Digite a sua nota da N2: " + "\n");
        n2 = ler.nextFloat();
        
        System.out.println("A sua média é: " + ((n1 + n2) * 2) / 3);
        
        
        
        
    }
}