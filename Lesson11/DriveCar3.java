package Lesson11;
public class DriveCar3 {
    public static void main(String[] args) {
        Car3 car1 = new Car3();
        car1.run(30);
        car1.display();

        Car3 car2 = new Car3(2525);
        car2.run(50);
        car2.display();
    }
}
