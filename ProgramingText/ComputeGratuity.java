/**
 * Created by liangjiahao on 2017/2/23.
 */
// 输入费用和酬金率,计算小费
import java.util.Scanner;

public class ComputeGratuity {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate :");
        double subtotal = imput.nextDouble();
        double gratuityRate = imput.nextDouble();

        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        System.out.print("The gratuity is " + gratuity + "and total is " + total);
    }
}
