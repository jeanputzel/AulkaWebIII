
import java.util.Scanner;
public class MainAluno {
    
    public static void main (String[] args) {                     
      Scanner ler = new Scanner(System.in);
      NotaAluno nA = new NotaAluno();
      float media;
        
        System.out.println("Digite o nome do aluno: ");
        nA.setNomeDoAluno(ler.next());  
        
        System.out.println("Digite a Disciplina do aluno: ");
        nA.setDisciplina(ler.next());
            
        System.out.println("Digite a N1: ");
        nA.setN1(ler.nextFloat());
        
        System.out.println("Digite a N2: ");
        nA.setN2(ler.nextFloat());
        
        System.out.println("Digite a N3: ");
        nA.setN3(ler.nextFloat());
            
        System.out.println("Digite a frequência do Aluno: ");
        nA.setFrequencia(ler.nextInt());
            
        media = (nA.getN1() + nA.getN2() + nA.getN3() / 3);
        System.out.println("A sua média é: " + media); 
                     
            
         if((media >= 6) && (nA.getFrequencia() >= 75)) {
                                
             System.out.println("O aluno está aprovado! ");
             
         }else{
             System.out.println("O aluno está reprovado! ");
         }
        
            
    }
}