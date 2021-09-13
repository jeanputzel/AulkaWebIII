import java.util.Scanner;

public class MainTurma {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);      
        Turma tur = new Turma();
        double  media;
             

    System.out.println("Informe o nome da turma 1: ");
        tur.setTurma1(ler.nextDouble());

    System.out.println("Informe o nome da turma 2: ");
        tur.setTurma2(ler.nextDouble());    

    System.out.println("Informe o nome da turma 3: ");
        tur.setTurma3(ler.nextDouble()); 
         

    System.out.println("Visualizando a Nota: ");

    System.out.println(tur.toString());

    media = (tur.getTurma1() + tur.getTurma2() + tur.getTurma3() / 3);
    System.out.println("A sua média é: " + media);    

   
    if(tur.getTurma1() > tur.getTurma2()) {
        System.out.println("A sua maior nota é da Turma 1");
    }else if(tur.getTurma2() > tur.getTurma3()) {
        System.out.println("A sua maior nota é da Turma 2");
    }else {
        System.out.println("A sua maior nota é da Turma 3");
    }
    
    if(tur.getTurma1() > media) {
        System.out.println("A Turma 1 tem a maior nota acima da média!!!");
    }else if(tur.getTurma2() > media) {
        System.out.println("A Turma 2 tem a maior nota acima da média!!!");
    }else if(tur.getTurma3() > media){
        System.out.println("A Turma 3 tem a maior nota acima da média!!!");
    }else {
        System.out.println("Nenhuma das Turmas tem a nota acima da média!!!");
    }

   }
}
