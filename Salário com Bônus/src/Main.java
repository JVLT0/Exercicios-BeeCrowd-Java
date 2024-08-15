import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        String nome = input.nextLine();
        double salario = input.nextDouble();
        double totalVendas = input.nextDouble();

        double bonus = totalVendas * (15.0/100.0) ;
        double salarioTotal = salario + bonus;

        System.out.printf("TOTAL = R$ %.2f\n",salarioTotal);
        
    }
 
}