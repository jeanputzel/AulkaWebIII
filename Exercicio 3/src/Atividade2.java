
//Crie um programa que receba vários números, calcule e mostre: 
//•A soma dos números digitados 
//•A quantidade de números digitados
//•A média dos números digitados
//•O maior número digitado
//•O menor número digitado
//•A média dos números pares 

import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) throws Exception {
        Scanner ler  = new Scanner(System.in);

    double soma = 0;
    int quantidade = 0;
    double media = 0;
    int maiorNumero = 0;
    int menorNumero = 0;
    double mediaPares = 0;
    int num = 0;
    

    for (int i = 0; i < 3; i++) {
        System.out.println("Digite um número");
        num = ler.nextInt();

        quantidade = i;

        if (num >= 0) {
            soma = num + soma;
            i ++;
        }
   
        media = soma / i;

        if (num < menorNumero) {
            menorNumero = num;
        }

        if (num >= maiorNumero) {
            maiorNumero = num;
        }

        if(num % 2 == 0) {
            mediaPares = soma / i;
        }

        if (i == 1) {
            menorNumero = num;
        }


    }
       System.out.println("Soma dos números: " + soma);
       System.out.println("Quantidade dos número: " + quantidade);
       System.out.println("A média dos números é: " + media);
       System.out.println("O seu maior número é: " + maiorNumero);
       System.out.println("O seu menor número é: " + menorNumero);
       System.out.println("A média dos pares é: " + mediaPares);


    }
}
