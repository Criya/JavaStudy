package Circle;
/**
 * Created by liangjiahao on 2017/3/13.
 */
public class TotalArea {
    public static void main(String[] args){
        CircleWithPrivateDateFields[] circleArray;

        circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    public static CircleWithPrivateDateFields[] createCircleArray(){
        CircleWithPrivateDateFields[] circleArray = new CircleWithPrivateDateFields[5];

        for (int i = 0; i < circleArray.length; i++){
            circleArray[i] = new CircleWithPrivateDateFields(Math.random() * 100);
        }
        return circleArray;
    }

    public static void printCircleArray(CircleWithPrivateDateFields[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++){
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("------------------------------------------------");

        System.out.println("The total area is " + sum(circleArray));
    }

    public static double sum(CircleWithPrivateDateFields[] circleArray){
        double sum = 0;

        for (int i = 0; i < circleArray.length; i++){
            sum += circleArray[i].getArea();
        }

        return sum;
    }
}
