package FactoryMethod;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public Cars createCar() {
        return new LuxuryCar();
    }
}
