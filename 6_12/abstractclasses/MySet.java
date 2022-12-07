package abstractclasses;

import java.util.ArrayList;
import java.util.List;

public class MySet<T> {
    private List<T> list = new ArrayList<T>();

    public void add(T object) {
        if (this.list.contains(object)) {
            return;
        }
        this.list.add(object);
    }

    public String toString() {
        String str ="[ ";
        for (T item: this.list){
            str += item.toString() + " ";
        }
        return str + "]";
    }
}
