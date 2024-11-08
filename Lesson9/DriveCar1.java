package Lesson9;
public class DriveCar1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.setNo(2525);
        car1.run(30);
        car1.display();
        car1.brake(10);
        car1.display();
    }
}
