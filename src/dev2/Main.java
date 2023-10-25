package dev2;
import dev1.Car;
import java.util.*;

class Test {

}
class MegaTest extends Test {

}


public class Main {
    public static void main(String[] args) {

        Test test1 = new Test();



        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car();
        car1.wheels = 6;
        Car car2 = new Car();
        System.out.println(car2.wheels); // 6

        int t = Car.wheels;
        Car.doMove();
        //String[] a = {"234","234234"};
        //Main.main(a);
        //System.out.println(a[]);

    }
}