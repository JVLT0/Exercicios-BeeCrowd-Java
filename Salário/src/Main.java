import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int numFuncionario = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double horaRecebida = input.nextDouble();

        double salario = horasTrabalhadas * horaRecebida;
        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
 
}