/**
 * Created by liangjiahao on 2017/2/23.
 */
import java.util.Scanner;
public class ComputeAndInterpretBMI {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter weight in kilogram :");
        double weight = imput.nextDouble();

        System.out.print("Enter height in meters");
        double height = imput.nextDouble();

        double bmi = weight / (height * height);
        bmi = (int)(bmi * 10) / 10.0;

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
