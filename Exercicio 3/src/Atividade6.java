//Crie um programa onde será exibido quantas pessoas possuem mais de 18 anos. 
//O algoritmo deverá ler a idade de 10 pessoas.

import java.util.Scanner;
public class Atividade6 {
 
    public static void main(String[] args) throws Exception  {
        Scanner ler = new Scanner(System.in);
             
        int idade = 0;
        int cont = 0;
            
        for (int i = 0; i < 10; i++) {
      
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa");
            idade = ler.nextInt();  
            
            if(idade > 18) {
              
                cont++;

            }
        }
          
        System.out.println("Quantidade de Pessoas maiores de 18 anos: " + cont);

    }
 
}