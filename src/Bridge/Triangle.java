package Bridge;

import java.awt.*;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle" + this.color);
    }
}
