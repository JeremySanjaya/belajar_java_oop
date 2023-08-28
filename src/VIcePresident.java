public class VIcePresident extends  Manager{

    VIcePresident(String name){
        super(name);
    }

    void  sayHello(String name){
        System.out.println("Hi" + name + ", My name is Vp" + this.name);
    }

}
