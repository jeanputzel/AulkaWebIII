
import java.util.Scanner;
public class Atividade10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        String numeroConta;
        double limiteCredito;
        double dinheiroGasto;

            System.out.println("Digite o nome da pessoa: ");

            nome = ler.nextLine();

            System.out.println("Digite o numero da conta: ");

            numeroConta = ler.nextLine();

            System.out.println("Digite o limite de crédito: ");

            limiteCredito = ler.nextInt();

            System.out.println("Digite o quanto foi gasto: ");

            dinheiroGasto = ler.nextInt();

            if(dinheiroGasto <= limiteCredito){

                System.out.println("Crédito ativo!");

            }

            else{

                System.out.println("Excedeu limite");

            }
    }
}