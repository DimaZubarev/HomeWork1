package module7.task4;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API {

    DAO dao = new DAOImpl();
    private Room[] rooms  = new Room[5];

    public TripAdvisorAPI() {
       dao.save(new Room(666777888, 100, 2, new Date(20160915), "Star", "Lviv"));
       dao.save(new Room(777888999, 110, 2, new Date(20160916), "Leon", "Lviv"));
       dao.save(new Room(888999000, 160, 2, new Date(20160916), "Galicia", "Lviv"));
       dao.save(new Room(999000111, 125, 2, new Date(20160916), "Diplomat", "Kyiv"));
       dao.save(new Room(000111222, 200, 2, new Date(20160917), "Consul", "Kyiv"));
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundRooms = new Room[100];
        Room roomFind = new Room(price, persons, city, hotel);
        ArrayList<Room> list = new ArrayList<>();
        for (Room room : rooms) {
            if (room.equals(roomFind)) {
                list.add(room);
            }
        }
        return list.toArray(new Room[list.size()]);
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
