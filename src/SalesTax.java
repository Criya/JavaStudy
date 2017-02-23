/**
 * Created by liangjiahao on 2017/2/23.
 */
import java.util.Scanner;
public class SalesTax {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter purchase amount :");
        double purchaseAmount = imput.nextDouble();

        double tax = purchaseAmount * 0.06;

        System.out.print("Sales tax is " + (int)(tax * 100) / 100.0);
    }
}
