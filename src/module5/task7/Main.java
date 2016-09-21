package module5.task7;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.requstRooms(100, 2, "Odessa", "Orion");
        controller.requstRooms(125, 2, "Kyiv", "Diplomat");
        controller.requstRooms(200, 2, "Kyiv", "Consul");

        API google = new GoogleAPI();
        API booking = new BookingComAPI();
        API trip = new TripAdvisorAPI();

        System.out.println(Arrays.toString(controller.check(google, booking))); // В этих двух случаях в консоль выводится инфа
        System.out.println(Arrays.toString(controller.check(google, trip)));    //
        controller.check(trip, booking);                                        // В этом случае нечего не выводится в консоль
 }

}
