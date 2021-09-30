
import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 

        double temperatura = 0;


        System.out.println("Digite a temperatura: ");
        temperatura = ler.nextDouble();
        if (temperatura <= 0){
            System.out.println("Sólido"); 
            } 
            else if(temperatura > 0 && temperatura <100){
                System.out.println("Líquido");
            }
            else{
                System.out.println("Gasoso");
            }



    }
}
