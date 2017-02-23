import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double Celsius = imput.nextDouble();

        double Farenheit = (9.0 / 5) * Celsius + 32;
        System.out.print(Celsius + " Celsius is " +(int)(Farenheit * 100) / 100.0 + "Fahrenheit");
    }
}
