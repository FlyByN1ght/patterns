package Memento;

import java.util.Stack;

public class Storage {

        private Stack<SnapshotMemento> history = new Stack<>();

        public void save(Snapshot snapshot) {
            history.push(snapshot.save());
        }

        public void undo(Snapshot snapshot) {
            if (!history.isEmpty()) {
                snapshot.restore(history.pop());
            }
        }
}
