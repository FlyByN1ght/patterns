import AbstractFactory.CarPartsFactory;
import AbstractFactory.LuxuryCarsPartsFactory;
import AbstractFactory.SportCarsPartsFactory;
import Builder.User;
import FactoryMethod.Cars;
import FactoryMethod.LuxuryCarFactory;
import FactoryMethod.SportCarFactory;
import Prototype.Address;
import Prototype.Person;
import Singleton.Singleton;

public class Main {

    static LuxuryCarFactory luxuryCarFactory = new LuxuryCarFactory();
    static SportCarFactory sportCarFactory = new SportCarFactory();
    static CarPartsFactory luxuryCarPartsFactory = new LuxuryCarsPartsFactory();
    static CarPartsFactory sportCarPartsFactory = new SportCarsPartsFactory();

    public static void main(String[] args) {
        factoryMethod();
        abstractFactory();
        builder();
        prototype();
        singleton();
    }

    public static void factoryMethod() {
        Cars luxury = luxuryCarFactory.createCar();
        Cars sport = sportCarFactory.createCar();
        System.out.println(luxury.getName() + ", " + sport.getName());
    }

    public static void abstractFactory() {
        String luxuryEngine = luxuryCarPartsFactory.createEngine();
        String luxuryWheels = luxuryCarPartsFactory.createWheels();
        String sportEngine = sportCarPartsFactory.createEngine();
        String sportWheels = sportCarPartsFactory.createWheels();
        System.out.println(luxuryEngine + ", " + luxuryWheels+ "\n"  + sportEngine + ", " + sportWheels);
    }

    public static void builder() {
        System.out.println(User.builder().name("Anton").lastName("Antonovich").email("mail").build().toString());
        System.out.println(User.builder().name("Anton").lastName("Antonovich").build().toString());
        System.out.println(User.builder().name("Anton").build().toString());
    }

    public static void prototype() {
        Address address = new Address("Minsk", "Top");
        Person real =  new Person("Pop","Opo", address);
        Person clone = real.clone();
        System.out.println(real == clone);
    }

    public static void singleton() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
