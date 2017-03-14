package Loan;
/**
 * Created by liangjiahao on 2017/3/14.
 */
import java.util.Scanner;
public class TestLoanClass {
    public static void main(String[] args){
        Scanner imput = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = imput.nextDouble();

        System.out.println("Enter loan amount, for example, 120000.95: ");
        double loanAmount = imput.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = imput.nextInt();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n The monthly payment is %.2f\n The total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());


    }
}
