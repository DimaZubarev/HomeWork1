package module5;

import java.util.Date;

public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(666777888, 120, 2, new Date(20160915), "Dnepr", "Kyiv");
        System.out.println("Searching room by id " + 666777888);
       return room;
    }
}
