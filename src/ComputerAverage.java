/**
 * Created by liangjiahao on 2017/2/21.
 */
// 计算三个数的平均值
import java.util.Scanner;
public class ComputerAverage {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Input three number");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double Average = (number1 + number2 + number3 ) / 3;
        System.out.print("The average is " + Average);


    }
}
