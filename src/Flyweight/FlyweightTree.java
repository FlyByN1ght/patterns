package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightTree {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        String key = name + color;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color));
            System.out.println("Создан новый тип дерева: " + name);
        }
        return treeTypes.get(key);
    }
}
