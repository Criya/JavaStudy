/**
 * Created by liangjiahao on 2017/3/13.
 */
public class TestCricleWithStaticMembers {
    public static void main(String agrs[]){
        System.out.println("Before creating objects");
        System.out.println("The number of Circle is " + CircleWithStaticMembers.numberOfObjects);

        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        System.out.println("After creating c1");
        System.out.println("c1 : radius(" + c1.radius + ") and the number of Circle objects(" + CircleWithStaticMembers.numberOfObjects + ")");

        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

        c1.radius = 9;

        System.out.println("After creating c2 and motifying c1");
        System.out.println("c1 : radius(" + c1.radius + ") and the number of Circle objects(" + CircleWithStaticMembers.numberOfObjects + ")");
        System.out.println("c2 : radius(" + c2.radius + ") and the number of Circle objects(" + CircleWithStaticMembers.numberOfObjects + ")");

    }
}
