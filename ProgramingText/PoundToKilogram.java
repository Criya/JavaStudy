/**
 * Created by liangjiahao on 2017/2/23.
 */
import java.util.Scanner;
public class PoundToKilogram {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pound = imput.nextDouble();
        double kilogram = pound * 0.454;

        System.out.print(pound + " pounds is " + kilogram + " kilograms");
    }
}
