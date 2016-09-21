package module5.task5;

import module5.task5.Room;
import module5.task5.DAO;

import java.util.Date;

public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println("Room save");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room delete");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room update");
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Room found");
       return null;
    }
}
