package module5.task7;

import module5.task7.Room;

public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println("Room save");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room delete");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room update");
        return room;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Room found");
       return null;
    }
}
