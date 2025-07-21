package BehavioralPatterns.Memento;

public class Snapshot {
    private String length;
    private String width;

    public Snapshot(String length, String width) {
        this.length = length;
        this.width = width;
    }

    public String getLength() {
        return length;
    }

    public String getWidth() {
        return width;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public SnapshotMemento save() {
        return new SnapshotMemento(length, width);
    }

    public void restore(SnapshotMemento snapshotMemento) {
        length = snapshotMemento.getLength();
        width = snapshotMemento.getWidth();
    }
}
