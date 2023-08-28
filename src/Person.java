public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String Address){
    name = name;
    address = Address;
    }

    Person(String paraName){
    this(paraName, null);
    }

    Person(){
        this(null);
    };

    void sayHello(String Name){
        System.out.println("Hello " + Name + ",My Name is + this.name" );
    }
}
