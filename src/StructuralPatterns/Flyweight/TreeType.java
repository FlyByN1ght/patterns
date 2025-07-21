package StructuralPatterns.Flyweight;

public class TreeType implements Tree {
    private String name;
    private String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Рисуем " + name + " с цветом " + color + " в точке (" + x + ", " + y + ")");
    }
}