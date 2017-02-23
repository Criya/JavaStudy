/**
 * Created by liangjiahao on 2017/2/23.
 */
import java.util.Scanner;
public class ComputeCylinderVolume {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder :");
        final double PI = 3.14159265;

        double radius = imput.nextDouble();
        double high = imput.nextDouble();
        double area = radius * radius *PI;
        double volume = area * high;

        System.out.println("The area is " + (int)(area * 10000) / 10000.0);
        System.out.println("The volume is " + (int)(volume * 10) / 10.0);


    }
}
