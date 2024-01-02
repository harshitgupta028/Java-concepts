package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public Map<String, Integer> numberSeries = new TreeMap<>();

    public Map<String, Integer> getNumberSeries() {
        return numberSeries;
    }

    public void setNumberSeries(Map<String, Integer> numberSeries) {
        this.numberSeries = numberSeries;
    }
}
