package module6.task5;

import java.util.ArrayList;

public class UserUtils {

    static User[] uniqueUsers(User[] users){
        for (int i = 0; i < users.length; i++){        //for(int i: users){
            for(int a = i+1; a < users.length; a++){   //for(int a: users){
                if(users[i].equals(users[a])){         //if(users[i].equals(users[a])){
                    users[a] = null;                   //users[a] = null;
                }
            }
        }
        return users;
    }
    static User[] usersWithContitionalBalance(User[] users, int balance) {
        ArrayList<User> list = new ArrayList<>();
        for(User user : users){
            if(user != null){
                if(user.getBalance() == balance){
                    list.add(user);
                }
            }
        }
        User users1[] = new User[list.size()];
        list.toArray(users1);
        return users1;
    }

     static User[] paySalaryToUsers(User[] users){
       for(User user: users){user.setBalance(user.getBalance() + user.getSalary());}
       return users;
   }

    public static long[] getUsersId(User[] users){
        long[] usersId = new long[users.length];
        for(int i = 0; i < users.length; i++){
            usersId[i] = users[i].getId();
        }
        return usersId;
    }
    public static User[] deleteEmptyUsers(User[] users) {
        ArrayList<User> list = new ArrayList<>();
        for (User user : users) {
            if (user != null) {
                list.add(user);
            }
        }
        User users1[] = new User[list.size()];
        list.toArray(users1);
        return users1;
    }
}
