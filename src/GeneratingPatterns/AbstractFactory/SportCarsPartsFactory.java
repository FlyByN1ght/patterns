package GeneratingPatterns.AbstractFactory;

public class SportCarsPartsFactory implements CarPartsFactory {
    @Override
    public String createEngine() {
        return "sport engine";
    }

    @Override
    public String createWheels() {
        return "sport wheels";
    }
}
