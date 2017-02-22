/**
 * Created by liangjiahao on 2017/2/22.
 */
// 获得格林威治标准时间，转换为现在的北京时间
public class ShowCurrentTime {
    public static void main(String args[]){
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
        //转化为北京时间
        long beijingTime = (currentHour + 8) % 24;
        System.out.println("现在的标准时间是 " + currentHour + " : " + currentMinutes + " : " + currentSecond);
        System.out.println("现在的北京时间是 " + beijingTime + " : " + currentMinutes + " : " + currentSecond);

    }
}
