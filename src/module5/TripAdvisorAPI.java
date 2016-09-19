package module5;

import java.util.Date;

public class TripAdvisorAPI implements API {

    private Room[] rooms;

    public TripAdvisorAPI() {

        rooms = new Room[5];
        rooms[0] = new Room(666777888, 100, 2, new Date(20160915), "Star", "Lviv");
        rooms[1] = new Room(777888999, 110, 2, new Date(20160916), "Leon", "Lviv");
        rooms[2] = new Room(888999000, 160, 2, new Date(20160916), "Galicia", "Lviv");
        rooms[3] = new Room(999000111, 120, 2, new Date(20160916), "West", "Lviv");
        rooms[4] = new Room(000111222, 125, 2, new Date(20160917), "Cossack", "Lviv");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

//    @Override
//    public Room[] getAll() {
//        return new Room[0];
//    }
}
