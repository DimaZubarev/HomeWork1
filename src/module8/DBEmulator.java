package module8;

import java.util.ArrayList;
import java.util.List;

public class DBEmulator <T> implements AbstractDAO <T> {
    List<T> list = new ArrayList<T>();

    @Override
    public T save(T t) {
        list.add(t);
        System.out.println("With savings T");
        return null;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
        System.out.println("We removed T");

    }

    @Override
    public void deleteAll(List<T> t) {
        list.removeAll(t);
        System.out.println("We removed all T");
    }

    @Override
    public void saveAll(List<T> t) {
        list.addAll(t);
        System.out.println("With savings all T");

    }

    @Override
    public List<T> getList() {
        return null;
    }
}
