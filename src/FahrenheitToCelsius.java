/**
 * Created by liangjiahao on 2017/2/22.
 */
//华氏度转为摄氏度
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit :");
        Double Fahrenheit = imput.nextDouble();

        Double Celsius = (5.0 / 9) * (Fahrenheit - 32);

        System.out.println("Fahrenheit " + Fahrenheit + " is " + Celsius + " in Celsius");
    }
}
