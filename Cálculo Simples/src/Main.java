import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] codigoDaPeca = new int[2]; 
        int[] numeroDePeca = new int[2];
        double[] valorPeca = new double[2];
        double[] valor = new double[2];

        for(int i = 0; i <=1; i++){
            codigoDaPeca[i] = input.nextInt();
            numeroDePeca[i] = input.nextInt();
            valorPeca[i] = input.nextDouble();

            valor[i] = numeroDePeca[i] * valorPeca[i];
        }

        double total = valor[0] + valor[1];

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
        
    }
 
}