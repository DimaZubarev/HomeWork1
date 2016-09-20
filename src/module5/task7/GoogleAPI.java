package module5.task7;

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
        Room[] foundRooms = new Room[100];
        int counter = 0;
        for (Room item : rooms) {
            if ((item.getPrice() == price) && (item.getPersons() == persons) && (item.getCityName() == city) && (item.getHotelName() == hotel));{
                foundRooms[counter] = item;
                counter++;
            }
        }

        Room[] foundRoomsArray = new Room[counter];
        for (int i = 0; i < counter; i++) {
            foundRoomsArray[i] = rooms[i];
        }
        return foundRoomsArray;
    }



    @Override
    public Room[] getAll() {
        return rooms;
    }
}
