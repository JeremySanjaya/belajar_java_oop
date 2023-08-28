package progammer.zaman.now.application;

import progammer.zaman.now.data.Animal;
import progammer.zaman.now.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {


        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();

    }
}
