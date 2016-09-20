package module5.task7;


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.requstRooms(100, 2, "Odessa", "Orion");
        controller.requstRooms(130, 2, "Kyiv", "Kyiv");
        controller.requstRooms(125, 2, "Lviv", "Cossack");

//        controller.check();
//        controller.check();
//        controller.check();
   }

}
