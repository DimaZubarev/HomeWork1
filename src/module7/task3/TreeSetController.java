package module7.task3;


import java.util.*;

public class TreeSetController {

    Set<Order> treeOrders = new TreeSet<>();
    List<User> listUsers = new ArrayList<>();

    public TreeSetController() {

        listUsers.add(new User("Bob", "Bobov", "Kyiv", 5954));
        listUsers.add(new User("Bim", "Bimov", "Kyiv", 6954));
        listUsers.add(new User("Bil", "Bilov", "Kyiv", 7954));
        listUsers.add(new User("Den", "Petrov", "Dnepr", 4954));
        listUsers.add(new User("Semen", "Semenov", "Lviv", 5854));
        listUsers.add(new User("Djon", "Djonov", "Odesa", 7854));
        listUsers.add(new User("Abram", "Abramov", "Odesa", 7754));
        listUsers.add(new User("Anton", "Antonov", "lviv", 15954));
        listUsers.add(new User("Semen", "Semenov", "Lviv", 16954));
        listUsers.add(new User("Alex", "Alexov", "Lviv", 17954));

       treeOrders.add(new Order(54968460, 1560, Currency.UAH, "Opel", "Opel Motors", listUsers.get(8)));
       treeOrders.add(new Order(54968461, 2500, Currency.UAH, "VW", "VW Motors", listUsers.get(1)));
       treeOrders.add(new Order(54968462, 3000, Currency.USD, "Kia", "Kia Motors", listUsers.get(0)));
       treeOrders.add(new Order(54968463, 2760, Currency.USD, "Volvo", "Volvo Motors", listUsers.get(2)));
       treeOrders.add(new Order(54968464, 1550, Currency.USD, "Suzuki", "Suzuki Motors", listUsers.get(3)));
       treeOrders.add(new Order(54968465, 5000, Currency.USD, "Audi", "Audi Motors", listUsers.get(9)));
       treeOrders.add(new Order(54968466, 2460, Currency.UAH, "BMW", "BMW Motors", listUsers.get(7)));
       treeOrders.add(new Order(54968467, 4360, Currency.USD, "Mersedes", "Mersedes Motors", listUsers.get(5)));
        treeOrders.add(new Order(54968447, 4360, Currency.USD, "Mersedes", "Mersedes Motors", listUsers.get(5)));
       treeOrders.add(new Order(54968460, 1560, Currency.UAH, "Opel", "Opel Motors", listUsers.get(4)));
    }

    boolean findLastName(String lastName) {
        for (Order order : treeOrders) {
            if (order.getUser().getLastName().equals(lastName))
                return true;
        }
        return false;
    }

    void orderWithLargestPrice (){
        System.out.println(treeOrders.iterator().next());
    }

    void deleteForCurrency(Currency currency) {
        Iterator<Order> iterator = treeOrders.iterator();
        while(iterator.hasNext()){
            Order order = iterator.next();
            if (order.getCurrency() == Currency.USD)
                iterator.remove();
        }
    }
}
