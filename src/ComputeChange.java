/**
 * Created by liangjiahao on 2017/2/23.
 */
import java.util.Scanner;
public class ComputeChange {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.println("输入数量,不超过两位小数,例,11.78 :");
        double amount = imput.nextDouble();

        int remainningAmount = (int)(amount * 100);
        int numberOfOneDollars = remainningAmount / 100; //一美元数量
        remainningAmount = remainningAmount % 100;  //剩余一美分数量

        int numberOfQuarters = remainningAmount / 25;   //二角五分数量
        remainningAmount = remainningAmount % 25;   //剩余一美分数量

        int numberOfDimes = remainningAmount / 10;  //一角数量
        remainningAmount = remainningAmount % 10;

        int numberOfNickels = remainningAmount / 5;    //五美分数量
        remainningAmount = remainningAmount % 5;

        System.out.println("你的$" + amount + "转化为零钱后是");
        System.out.println("    " + numberOfOneDollars + " 美元");
        System.out.println("    " + numberOfQuarters + " 2角5分");
        System.out.println("    " + numberOfDimes + " 角");
        System.out.println("    " + numberOfNickels + " 5美分");
        System.out.println("    " + remainningAmount + " 美分");

    }
}
