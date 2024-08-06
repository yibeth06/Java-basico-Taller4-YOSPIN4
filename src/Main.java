import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<11; i++){
            suma = suma + i;
            System.out.println("La suma `" + i + "` es: " + suma);
        }
        System.out.println("--------------------------------------------");
        System.out.println("La sumatoria total del 1 al 10 es: " + suma);
    }
}