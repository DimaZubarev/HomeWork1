package module7.task4;
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}

