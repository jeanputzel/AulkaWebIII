/* ESTADO CIVIL */

import java.util.Scanner;

public class Atividade11 {
    
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

    
        char digitar;

        System.out.println("Escreva a inicial de acordo com seu estado civil:\n S - Solteiro(a)\n C - Casado(a) \n V - Viuvo(a) \n D - Divorciado(a) ");        
        digitar = ler.next().charAt(0);

        switch(digitar){
            case 'S':
                System.out.println("Estado civil solteiro(a)!");
                break;
            case 'C':
                System.out.println("Estado civil casado(a)!");
                break;
            case 'V':
                System.out.println("Estado civil viuvo(a)!");
                break;
            case 'D':
                System.out.println("Estado civil divorciado(a)!");
                break;

    }
}
}