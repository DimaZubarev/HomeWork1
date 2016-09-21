package module5.task4;

import module5.task4.Room;
import module5.task4.API;

import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {

        rooms[0] = new Room(666777888, 120, 2, new Date(20160915), "Dnepr", "Kyiv");
        rooms[1] = new Room(777888999, 130, 2, new Date(20160916), "Kyiv", "Kyiv");
        rooms[2] = new Room(888999000, 160, 2, new Date(20160916), "Capital", "Kyiv");
        rooms[3] = new Room(999000111, 125, 2, new Date(20160916), "Diplomat", "Kyiv");
        rooms[4] = new Room(000111222, 200, 2, new Date(20160917), "Consul", "Kyiv");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

//    @Override
//    public Room[] getAll() {return rooms;}
}
