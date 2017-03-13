/**
 * Created by liangjiahao on 2017/3/13.
 */
public class CircleWithStaticMembers {
    double radius;
    static int numberOfObjects = 0;

    CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return Math.PI *radius * radius;
    }
}
