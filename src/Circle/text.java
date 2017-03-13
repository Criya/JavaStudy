package Circle;

/**
 * Created by liangjiahao on 2017/3/13.
 */
public class text {
    public static void main(String[] args){
        CircleWithPrivateDateFields myCircle = new CircleWithPrivateDateFields(5.0);
        printCircle(myCircle);
    }

    public static void printCircle(CircleWithPrivateDateFields c){
        System.out.println("The area of the circle of radius" + c.getRadius() + " is " + c.getArea());
    }
}
