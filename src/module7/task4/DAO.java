package module7.task4;

public interface DAO {

    boolean save(Room room);
    boolean delete(Room room);
    Room update(Room room, int index);
    Room findById(long id);
}
