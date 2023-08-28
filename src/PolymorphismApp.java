public class PolymorphismApp {
    public static void main(String[] args) {


        Employee employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new VIcePresident("Eko");
        employee.sayHello("Budi");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Joko"));
        sayHello(new VIcePresident("Budi"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof VIcePresident){
            VIcePresident vIcePresident = (VIcePresident) employee;
            System.out.println("Hello VP " + employee.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
