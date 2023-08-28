package progammer.zaman.now.application;

import progammer.zaman.now.data.Application;
import static progammer.zaman.now.data.Constant.*;
import progammer.zaman.now.data.Country;
import progammer.zaman.now.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Jember");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);

        }

    }

