package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public Queue<String> locations = new LinkedList<>();

    public Queue<String> getLocations() {
        return locations;
    }

    public void setLocations(Queue<String> locations) {
        this.locations = locations;
    }
}
