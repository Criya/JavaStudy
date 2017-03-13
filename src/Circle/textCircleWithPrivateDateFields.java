package Circle;

/**
 * Created by liangjiahao on 2017/3/13.
 */
public class textCircleWithPrivateDateFields {
    public static void main(String[] args){
        CircleWithPrivateDateFields myCircle = new CircleWithPrivateDateFields(5.0);

        System.out.println("The area of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("After motifying, the area of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("Ther number of objects created is " + CircleWithPrivateDateFields.getNumberOfObjects());
    }
}
