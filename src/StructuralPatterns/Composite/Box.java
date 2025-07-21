package StructuralPatterns.Composite;

public class Box implements BoxComponent {

    private final int price;

    public Box(int price) {
        this.price = price;
    }

    @Override
    public int count() {
       return price;
    }
}
