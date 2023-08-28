package progammer.zaman.now.application;

import progammer.zaman.now.data.*;

import javax.xml.namespace.QName;

public class Application{
    public static void main(String[] args) {

        Product product = new Product("Mac Book Pro", 3000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
