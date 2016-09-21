package module5.task4;

import module5.task4.Room;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

}

