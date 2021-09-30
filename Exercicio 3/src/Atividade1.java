//Crie um programa em Java para apresentar os resultados da tabuada de um número qualquer.
//O usuário informa qual o valor deseja e o programa deverá retornar o cálculo da tabuada
//de 0 a 10. Usar laço de repetição - Livre


import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe um número: ");  
    int valor;
    int multiplicador = 0;
    int total = 0;

    valor = ler.nextInt();

    for (int x = 0; x < 10; x++) {
            total = valor * ++multiplicador;
            System.out.println(valor + " x " + multiplicador + " = " + total);
        }

    }
 }
 