package module5.task6;

import module5.task6.Room;
import module5.task6.API;
import module5.task6.BookingComAPI;
import module5.task6.GoogleAPI;
import module5.task6.TripAdvisorAPI;

public class Controller {

    private API apis[] = new API[3];

    public Controller() {

        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }


// Мы перебираем массивы и находим нужное
// В первом методе мы прочесываем 3 масива и собираем общак
// Во втором мы перебираем данные из общака
//   В третем сохраняем в базу данных
    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        Room [] foundRooms = new Room[100];
        int counter = 0;
        for(int i = 0; i < 3; i++){
            for(Room item : apis[i].findRooms(price, persons, city, hotel)){
                foundRooms[counter] = item;
                counter++;
            }
        }

        Room [] foundRoomsArrey = new Room[counter];
        for(int i = 0; i < counter; i++) {
            foundRoomsArrey[i] = foundRooms[i];
        }

        DAOImpl daoImpl = new DAOImpl();
        for(Room room : foundRoomsArrey) {
            daoImpl.save(room);
        }

        return foundRoomsArrey;
    }

    Room[] cheack (API api1, API api2) {
        Room[] roomsFromApi1=api1.getAll();
        Room[] roomsFromApi2=api2.getAll();

        Room[] room=new Room[100];
        int count=0;
        for(int i=0;i<roomsFromApi1.length;i++){
            for (int j=i;j<roomsFromApi1.length;j++){
                if(roomsFromApi1[i].equals(roomsFromApi2[j])){
                    room[count]=roomsFromApi1[j];
                    count++;
                }
            }
        }

        return room;
    }
}




