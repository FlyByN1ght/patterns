package AbstractFactory;

public class LuxuryCarsPartsFactory implements CarPartsFactory {
    @Override
    public String createEngine() {
        return "luxury motor";
    }

    @Override
    public String createWheels() {
        return "luxury wheels";
    }
}
