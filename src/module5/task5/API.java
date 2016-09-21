package module5.task5;

import module5.task5.Room;
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}

