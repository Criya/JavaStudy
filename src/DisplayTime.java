/**
 * Created by liangjiahao on 2017/2/22.
 */
//输入秒数，转化为分钟和秒
import java.util.Scanner;
public class DisplayTime {
    public static void main(String agrs[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer for seconds: ");
        int Seconds = input.nextInt();

        int minutes = Seconds / 60;
        int remainingSeconds = Seconds % 60;

        System.out.println(Seconds +" seconds is " + minutes + " minutes is " + remainingSeconds + " seconds");

    }
}
