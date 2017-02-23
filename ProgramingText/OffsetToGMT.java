/**
 * Created by liangjiahao on 2017/2/23.
 */
import java.util.Scanner;
public class OffsetToGMT {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT :");
        int offset = imput.nextInt();
        // 获得从1970年1月1日00:00:00到现在的GMT时间的总毫秒数
        long totalMilliSeconds = System.currentTimeMillis();
        // 到现在总秒数
        long totalSeconds = totalMilliSeconds / 1000;
        //现在秒数
        long currentSecond = totalSeconds % 60;
        //总时间分钟
        long totalMinutes = totalSeconds / 60;
        //现在的时间分钟
        long currentMinutes = totalMinutes % 60;
        //总小时
        long totalHours = totalMinutes / 60;
        //现在小时
        long currentHour = totalHours % 24 ;

        System.out.println("The current time is " + (currentHour +offset) % 24 + " : " + currentMinutes + " : " + currentSecond);


    }
}
