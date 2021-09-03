
/**
    *Escreva um programa para ler o número de lados de um polígono regular
    *e a medida do lado (em cm). Calcular e imprimir o seguinte:
    *Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da area
    *Se o número de lados for igual a 4 escrever QUADRADO e o valor da
    *sua área.
 */

import java.util.Scanner;

public class Poligono {
    
    public static void main (String[] args) {
        
        double lados;
        double cm;
        double area;
           
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número de lados: ");
            lados = ler.nextDouble();    
        
        System.out.println("Digite o cm: ");
            cm = ler.nextDouble();  
            
            area = cm * 2;
            

         if(lados == 3) {
                                
             System.out.println("O seu Polígono é um TRIÂNGULO com a área de: " + area);
             
         }else if(lados == 4){
             System.out.println("O seu Polígono é um QUADRADO com a área de: " + area);
         }
        
            
    }
}