package module6.task5;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[3];
        users[0] = new User(1234,"Dima", "Zub", 2500, 25000);
        users[1] = new User(1235, "Anna", "Sad", 2450, 24500);
        users[2] = new User(1236, "Gleb", "Bar", 2400, 24000);

        User[] uniq = UserUtils.uniqueUsers(users);
        User[] cont = UserUtils.usersWithContitionalBalance(users, 2450);
        User[] salary = UserUtils.paySalaryToUsers(users);
        long[] getid = UserUtils.getUsersId(users);
        User[] delet = UserUtils.deleteEmptyUsers(users);



    }
}
