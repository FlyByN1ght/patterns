package Composite;

import java.util.List;

public class BoxContainer implements BoxComponent {

    private final List<BoxComponent> components;

    public BoxContainer(List<BoxComponent> components) {
        this.components = components;
    }

    @Override
    public int count() {
        return components.stream().mapToInt(BoxComponent::count).sum();
    }
}
