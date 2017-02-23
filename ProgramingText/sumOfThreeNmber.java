/**
 * Created by liangjiahao on 2017/2/23.
 */
//输入一个0—1000以内的数,求三个数的和
import java.util.Scanner;

public class sumOfThreeNmber {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000 : ");

        int number = imput.nextInt();
        int hundred = number /100;
        int remainningNumber = number % 100;
        int decade = remainningNumber / 10;
        int theUnit = remainningNumber % 10;

        int total = hundred + decade + theUnit;

        System.out.print("The sum of the digits is " + total);
    }
}
