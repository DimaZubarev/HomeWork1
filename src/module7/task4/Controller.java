package module7.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Controller {

    private API apis[] = new API[3];

    public Controller() {

        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        List<Room> list = new ArrayList<>();
        for (API api : apis) {
            Room[] res = api.findRooms(price, persons, city, hotel);
            for (Room room : res) {
                if (res != null) {
                    list.add(room);
                }
            }

        }
        return list.toArray(new Room[list.size()]);
    }

    Room[] check(API api1, API api2) {
        Room[] roomsFromApi1 =api1.getAll();
        Room[] roomsFromApi2 =api2.getAll();

        Set<Room> set= new HashSet<>();
        for (Room room: roomsFromApi1) {
            for (Room room1 : roomsFromApi2) {
                if (room.equals(room1)) {
                    set.add(room);
                }
            }
        }
        return set.toArray(new Room[set.size()]);
    }

}



