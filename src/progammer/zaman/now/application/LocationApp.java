package progammer.zaman.now.application;

import progammer.zaman.now.data.City;
import progammer.zaman.now.data.Location;

public class LocationApp{
    public static void main(String[] args) {

        // var location = new Location(); // ERROR
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);

    }
}
