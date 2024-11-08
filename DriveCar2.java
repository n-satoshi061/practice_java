public class DriveCar2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        car1.run(30);
        car1.display();

        Car2 car2 = new Car2(2525);
        car2.run(50);
        car2.display();
    }
}
