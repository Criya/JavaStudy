package Loan;

/**
 * Created by liangjiahao on 2017/3/14.
 */
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmounts;
    private java.util.Date loanDate;

    public Loan(){
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmounts){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmounts = loanAmounts;
        loanDate = new java.util.Date();
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears(){
        return this.numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmounts(){
        return this.loanAmounts;
    }

    public void setLoanAmounts(double loanAmounts){
        this.loanAmounts = loanAmounts;
    }

    public double getMonthlyPayment(){
        double monthlyPaymentRate = annualInterestRate / 1200;
        double totalPayment = loanAmounts * monthlyPaymentRate / (1 - (1 / Math.pow(1 + monthlyPaymentRate, 12 * numberOfYears)));
        return totalPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * 12 * getNumberOfYears();
        return totalPayment;
    }
    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
