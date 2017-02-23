/**
 * Created by liangjiahao on 2017/2/23.
 */
import java.util.Scanner;
public class InchToMeter {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double inch = imput.nextDouble();
        double meter = inch * 0.305;

        System.out.print(inch + " feet is " + meter + "meters");
    }
}
