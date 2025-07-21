import GeneratingPatterns.AbstractFactory.CarPartsFactory;
import GeneratingPatterns.AbstractFactory.LuxuryCarsPartsFactory;
import GeneratingPatterns.AbstractFactory.SportCarsPartsFactory;
import StructuralPatterns.Bridge.Circle;
import StructuralPatterns.Bridge.Triangle;
import GeneratingPatterns.Builder.User;
import StructuralPatterns.Composite.BoxContainer;
import StructuralPatterns.Composite.Box;
import StructuralPatterns.Decorator.Developer;
import StructuralPatterns.Decorator.JuniorDeveloper;
import StructuralPatterns.Decorator.SeniorDeveloper;
import GeneratingPatterns.FactoryMethod.Cars;
import GeneratingPatterns.FactoryMethod.LuxuryCarFactory;
import GeneratingPatterns.FactoryMethod.SportCarFactory;
import GeneratingPatterns.Prototype.Address;
import GeneratingPatterns.Prototype.Person;
import GeneratingPatterns.Singleton.Singleton;
import GeneratingPatterns.Singleton_v2.Singletons;

import java.awt.*;
import java.util.List;

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
        singleton2();
        bridge();
        composite();
        decorator();
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
        System.out.println(User.builder().build().toString());
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

    public static void singleton2() {
        Singletons singleton = Singletons.INSTANCE;
        Singletons singleton1 = Singletons.INSTANCE;
        System.out.println(singleton == singleton1);
    }

    public static void bridge() {
        Triangle triangle = new Triangle(Color.blue);
        triangle.draw();
        Circle circle = new Circle(Color.black);
        circle.draw();
    }

    public static void composite() {
        BoxContainer boxContainer = new BoxContainer(List.of(new Box(1)));
        BoxContainer boxContainer2 = new BoxContainer(List.of(new Box(2)));
        BoxContainer boxContainer3 = new BoxContainer(List.of(new Box(3), boxContainer));
        BoxContainer boxContainer4 = new BoxContainer(List.of(new Box(4), boxContainer2,  boxContainer3));
        System.out.println(boxContainer4.count());
    }

    public static void decorator() {
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper(junior);

        System.out.println(junior.makeJob() + "\n" + senior.makeJob());
    }
}
