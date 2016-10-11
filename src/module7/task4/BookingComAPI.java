package module7.task4;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API {

    DAO dao = new DAOImpl();
    private Room[] rooms  = new Room[5];

    public BookingComAPI() {

        dao.save(new Room(111222333, 100, 2, new Date(20160915), "Orion", "Odesa"));
        dao.save(new Room(111222333, 100, 2, new Date(20160915), "Orion", "Odesa"));
        dao.save(new Room(222333444, 120, 2, new Date(20160916), "King", "Odesa"));
        dao.save(new Room(888999000, 160, 2, new Date(20160916), "Galicia", "Lviv"));
        dao.save(new Room(999000111, 125, 2, new Date(20160916), "Diplomat", "Kyiv"));
        dao.save(new Room(555666777, 150, 4, new Date(20160917), "Fortuna", "Odesa"));
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
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