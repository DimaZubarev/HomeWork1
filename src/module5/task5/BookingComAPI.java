package module5.task5;

import module5.task5.Room;
import module5.task5.API;

import java.util.Date;

public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(111222333, 100, 2, new Date(20160915), "Orion", "Odessa");
        rooms[1] = new Room(222333444, 120, 2, new Date(20160916), "King", "Odesssa");
        rooms[2] = new Room(333444555, 125, 2, new Date(20160916), "Robinzon", "Odesssa");
        rooms[3] = new Room(444555666, 120, 2, new Date(20160916), "Sea", "Odesssa");
        rooms[4] = new Room(555666777, 150, 4, new Date(20160917), "Fortuna", "Odesssa");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {return new Room[0];}

    @Override
    public Room[] getAll() {return rooms;}
}