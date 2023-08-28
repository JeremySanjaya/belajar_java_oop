package progammer.zaman.now.application;

import progammer.zaman.now.data.Avanza;
import progammer.zaman.now.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.geTier());
        car.drive();
    }
}
