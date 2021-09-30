//Faça um algoritmo que some o total de produtos digitados. 
//O usuário deverá informar a quantidade de produtos que serão informados e o tipo de produto. 
//Exemplo: O user digitou - arroz, feijão e batata --> o programa deverá exibir o número "3".

import java.util.Scanner;
public class Atividade7 { 
public static void main(String[] args) throws Exception  {
    Scanner ler = new Scanner(System.in);
  
    int quantidadeProd = 0;
    String tipoProd;


        boolean flag = true;
        while (flag == true) {

            System.out.println("Digite o nome do produto: ");
            tipoProd = ler.next();

           
            if(tipoProd.equals("stop")){
                quantidadeProd--;

            flag = false;
            }

            quantidadeProd++;
            
        }    
        System.out.println(quantidadeProd);        
    }
}
