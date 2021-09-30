//Elabore um algoritmo que some a idade de 5 pessoas e retorne o nome destas pessoas. 
//O usuário deverá digitar o nome + a idade de 5 pessoas. 
//O programa deverá retornar o nome das 5 pessoas + a soma da idade destas pessoas.


import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
       
        String nome;
        String todosNomes = "";
        int idade = 0;
        double soma = 0;      
           
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o nome da " + (i + 1) + "ª pessoa");
            nome = ler.next();

            todosNomes = todosNomes + " " + nome;

            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa");
            idade = ler.nextInt();

            soma = soma + idade;
                
                
             }

             System.out.println(todosNomes);
             System.out.println("A soma das idades é de: " + soma);
        }
    }

