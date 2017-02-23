/**
 * Created by liangjiahao on 2017/2/23.
 */
import java.util.Scanner;
public class ComputeAcceleratedSpeed {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t:");
        double v0 = imput.nextDouble();
        double v1= imput.nextDouble();
        double t = imput.nextDouble();

        double AcceleratedSpeed = (v1 - v0) / t;

        System.out.print(" The average acceleration is " + (int)(AcceleratedSpeed * 10000) / 10000.0);
    }
}
