package module5;

import java.util.Date;

public class Controller implements API {

    private API apis[] = new API[3];

    public Controller() {

        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        return new Room[0];
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        Room[] BookingComAPI = apis[0].findRooms(price, persons, city, hotel);

        Room[] GoogleAPI = apis[1].findRooms(price, persons, city, hotel);

        Room[] ripAdvisorAPI = apis[2].findRooms(price, persons, city, hotel);

        //int length;
        int length = BookingComAPI.length + GoogleAPI.length + ripAdvisorAPI.length;

        return new Room[0];
    }

    Room[] check(API api1, API api2) {

//        Room[] result1 = api1.findRooms(125, 2, "Robinzon", "Odesssa");
//        Room[] result2 = api2.findRooms(125, 2, "Cossack", "Lviv");
//        result1.equals(result2);
//        return new Room[0];

//        Room[] roomsFromApi1 = api1.getAll();
//        Room[] roomsFromApi2 = api2.getAll();

        int countRooms;

//        for(int i = 0; i < roomsFromApi1.length; i++);
//        for(int i = 0; i < roomsFromApi2.length; i++);

        return null;
    }
}



