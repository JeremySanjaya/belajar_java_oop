public class ManagerApp {
    public static void main(String[] args) {


        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Budi");

        var vp = new VIcePresident();
        vp.name = "Joko";
        vp.sayHello("Budi");

        System.out.println(manager);
        System.out.println(vp);
    }
}
