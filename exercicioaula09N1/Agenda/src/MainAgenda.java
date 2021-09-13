import java.util.Scanner;
public class MainAgenda {
    public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);    
    Agenda ag = new Agenda(); 

    System.out.println("Informe seu nome: ");
        ag.setNome(ler.next());

    System.out.println("Informe seu telefone: ");    
        ag.setTelefone(ler.nextInt());

     System.out.println("Informe seu Email: ");    
        ag.setEmail(ler.next());

    System.out.println("Informe seu endereço: ");    
        ag.setEndereco(ler.next());
  

    System.out.println("Visualizando a Agenda: ");
    System.out.println(ag.toString());

    }
}
