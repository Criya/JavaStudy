/**
 * Created by liangjiahao on 2017/3/13.
 */
public class CircleWithPrivateDateFields {
    private double radius = 1;
    private static  int numberOfObjects = 0;

    public CircleWithPrivateDateFields(){
        numberOfObjects++;
    }
    public CircleWithPrivateDateFields(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius(){
        return radius;
    }
    
}
