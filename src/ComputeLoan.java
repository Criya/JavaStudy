/**
 * Created by liangjiahao on 2017/2/23.
 */
// 输入贷款额度,年利率,年数,计算后输出月付款额的和总付款额度
import java.util.Scanner;
public class ComputeLoan {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("请输入年利率,例,7.25% :");
        double annualInterestRate = imput.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200.0;

        System.out.print("请输入一个整数年份 : ");
        int numberOfYear = imput.nextInt();

        System.out.print("请输入贷款额度 :");
        double loanAmount = imput.nextDouble();

        double mothlyPaymet = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,numberOfYear * 12));
        double totalPayment = mothlyPaymet * numberOfYear * 12;

        System.out.println("每个月需要支付的额度是￥" + (int)(mothlyPaymet * 100) / 100.0);
        System.out.println("总的支付额度是￥" + (int)(totalPayment * 100) / 100);
    }
}
