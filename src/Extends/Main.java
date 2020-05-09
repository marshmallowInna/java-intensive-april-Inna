package Extends;

public class Main {
    public static void main(String[] args) {


        Car car = new Car(" BMV", " new ");
        car.color();
        System.out.println("red");
        car.setName("Kia");

        SportCar sportCar = new SportCar("BMW", "new","500h",5);
        sportCar.setSpeed("500");
        sportCar.turbo();

        Offroad offroad = new Offroad("BMW", "new","500h",5,"average");
        offroad.Location();

        Minivan minivan = new Minivan("BMW", "new","500h",5,"average");
        minivan.shipping();
        System.out.println("human");
    }
}
