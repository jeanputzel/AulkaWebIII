import java.util.Scanner;
public class MainTreino {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);      
        Treino tre = new Treino();
        double  media;
             

    System.out.println("Informe o nome do atleta: ");
        tre.setNomeAtleta(ler.next());

    System.out.println("Informe o treino do atleta: ");
        tre.setTreino(ler.next());    

    System.out.println("Informe a marca 1 do atleta: ");
        tre.setMarca1(ler.nextDouble()); 
        
    System.out.println("Informe a marca 2 do atleta: ");
        tre.setMarca2( ler.nextDouble()); 
        
    System.out.println("Informe a marca 3 do atleta: ");
        tre.setMarca3(ler.nextDouble());    
        

    System.out.println("Visualizando a MARCA: ");

    System.out.println(tre.getTreino());

    media = (tre.getMarca1() + tre.getMarca2() + tre.getMarca3() / 3);
    System.out.println("A sua média é: " + media);     
   
    if(tre.getMarca1() > tre.getMarca2()) {
        System.out.println("A sua maior marca é a marca 1");
    }else if(tre.getMarca2() > tre.getMarca3()) {
        System.out.println("A sua maior marca é a marca 2");
    }else {
        System.out.println("A sua maior marca é a marca 3");
    }   

   }
}
