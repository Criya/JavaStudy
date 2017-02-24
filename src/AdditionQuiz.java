/**
 * Created by liangjiahao on 2017/2/23.
 */
import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);
        int number1 = (int)(System.currentTimeMillis() % 43);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        System.out.println(
                "what is " + number1 + " + " + number2 + " ? "
        );
        int answer = imput.nextInt();

        System.out.print(
                number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer)
        );
    }
}
