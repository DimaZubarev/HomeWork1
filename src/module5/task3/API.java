package module5.task3;

import module5.task1.Room;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}

