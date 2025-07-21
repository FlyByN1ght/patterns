package StructuralPatterns.Flyweight;

public class Forest {
    public void plantTree(int x, int y, String name, String color) {
        TreeType type = FlyweightTree.getTreeType(name, color);
        type.draw(x, y);
    }
}