//Programa em Java que calcula a média das notas de uma turma:
//Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
//Em seguida, através de um laço while, 
//pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.

import java.util.Scanner;
public class Atividade5 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
double media = 0;
int quantidadeAluno = 0;
int nota = 0;
int i = 0;
double soma = 0;

System.out.println("Digite a quantidade de alunos: ");
    quantidadeAluno = ler.nextInt();

while(quantidadeAluno >= i) {
    System.out.println("Notas: ");
    nota = ler.nextInt();

    soma = nota + soma;
    i++;
}

    media = soma / quantidadeAluno;
    System.out.println("Quantidade de alunos: " + quantidadeAluno);
    System.out.println("Média quantidade: " + media);
    
    }
}
