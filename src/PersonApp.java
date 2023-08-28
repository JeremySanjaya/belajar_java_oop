public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Jeremy", "Jember");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person("Jeremy", "Jakarta");

        Person person3;
        person3 = new Person("Jeremy", "Cirebon");
        person3.sayHello("Budi");
    }
}
