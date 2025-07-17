package Memento;

public class SnapshotMemento {
    private String length;
    private String width;

    public SnapshotMemento(String length, String width) {
        this.length = length;
        this.width = width;
    }

    public String getLength() {
        return length;
    }

    public String getWidth() {
        return width;
    }
}
