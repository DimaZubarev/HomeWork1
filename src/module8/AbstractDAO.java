package module8;
import java.util.List;
public interface AbstractDAO <T> {
    T save (T t);
    void delete(T t);
    void deleteAll (List <T> t);
    void saveAll(List <T> t);
    List <T> getList();
}
