package FactoryMethod;

public class SportCarFactory implements CarFactory {
    @Override
    public Cars createCar() {
        return new SportCar();
    }
}
