import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        double pi = 3.14159;
        int R = input.nextInt();

        double volume = (4.0/3.0) * pi * Math.pow(R, 3);
        System.out.printf("VOLUME = %.3f\n",volume);
 
    }
 
}