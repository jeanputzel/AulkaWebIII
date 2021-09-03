
/**
 *  Criar um algoritmo onde digita-se:
- Nome do aluno
- Disciplina;
- Nota1, nota2 e nota3;
- Frequência do aluno;
O programa deverá retornar o nome, 
a disciplina, 
a média final (n1 + n2 + n3 / 3) 
e se o aluno está aprovado 
(aprovado com frequência igual e superior a 75% e média >= 6).
 */

import java.util.Scanner;

public class Nota {
    
    public static void main (String[] args) {
        
        String nomeDoAluno;
        String disciplina;
        int frequencia;
        float n1, n2, n3, media;
           
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
            nomeDoAluno = ler.next();    
        
        System.out.println("Digite a Disciplina do aluno: ");
            disciplina = ler.next();
            
        System.out.println("Digite a N1: ");
            n1 = ler.nextFloat();
        
        System.out.println("Digite a N2: ");
            n2 = ler.nextFloat();
        
        System.out.println("Digite a N3: ");
            n3 = ler.nextFloat(); 
            
        System.out.println("Digite a frequência do Aluno: ");
            frequencia = ler.nextInt(); 
            
        System.out.println("Nome do Aluno: " + nomeDoAluno);
        System.out.println("Disciplina: " + disciplina); 
                                
        System.out.println("Frequência: " + frequencia);  
        
        System.out.println("A sua média é: " + (n1 + n2 + n3) / 3); 
                     
            media = (n1 + n2 + n3) / 3;
         if((media >= 6) && (frequencia >= 75)) {
                                
             System.out.println("O aluno está aprovado! ");
             
         }else{
             System.out.println("O aluno está reprovado! ");
         }
        
            
    }
}