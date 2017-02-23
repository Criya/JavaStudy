/**
 * Created by liangjiahao on 2017/2/23.
 */
//输入时间(分钟),转化为年数和天数

import java.util.Scanner;

public class ComputeYears {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter the number of minutes :");

        int totalminutes = imput.nextInt();
        int dayOfMinutes = 60 * 24;
        int yearOfMinutes = 60 * 24 * 365;
        int years = totalminutes % yearOfMinutes;
        int remainningMinutes = totalminutes % yearOfMinutes;
        int days = remainningMinutes / dayOfMinutes;

        System.out.print(totalminutes + " minutes is approximately " + years + " years and" + days +" days");
    }
}
