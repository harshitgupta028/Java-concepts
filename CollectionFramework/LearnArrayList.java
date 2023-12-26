package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

/**
 * LearnArrayList
 */
public class LearnArrayList {

    List<String> names = new ArrayList();
    List<Integer> num = new ArrayList();

    public List<Integer> getNum() {
        return num;
    }

    public void setNum(List<Integer> num) {
        this.num = num;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
       
}