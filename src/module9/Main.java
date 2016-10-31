package module9;

import java.util.*;

import static module9.Currency.USD;

public class Main {

    public static void main(String[] args) {

        Set<Order> treeOrders = new TreeSet<>();
        List<User> listUsers = new ArrayList<>();

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
        treeOrders.add(new Order(54968462, 3000, USD, "Kia", "Kia Motors", listUsers.get(0)));
        treeOrders.add(new Order(54968463, 2760, USD, "Volvo", "Volvo Motors", listUsers.get(2)));
        treeOrders.add(new Order(54968464, 1450, USD, "Suzuki", "Suzuki Motors", listUsers.get(3)));
        treeOrders.add(new Order(54968465, 5000, USD, "Audi", "Audi Motors", listUsers.get(9)));
        treeOrders.add(new Order(54968466, 2460, Currency.UAH, "BMW", "BMW Motors", listUsers.get(7)));
        treeOrders.add(new Order(54968467, 4460, USD, "Mersedes", "Mersedes Motors", listUsers.get(5)));
        treeOrders.add(new Order(54968447, 4360, USD, "Mersedes", "Mersedes Motors", listUsers.get(5)));
        treeOrders.add(new Order(54968460, 1570, Currency.UAH, "Opel", "Opel Motors", listUsers.get(4)));


        Comparator <Order> price = ((t1, t2) -> t2.getPrice() - t1.getPrice());

        Comparator<Order> priceCity = ((t1, t2) -> {
            if (t1.getPrice() - t2.getPrice() == 0)
                return t1.getUser().getCity().compareTo(t2.getUser().getCity());
            return t1.getPrice() - t2.getPrice();
        });

        Comparator<Order> itemNameShopIdentificatorUserCity =((t1, t2) -> {
            if (t1.getItemName().compareTo(t2.getItemName()) == 0)
                if (t1.getShopIdentificator().compareTo(t2.getShopIdentificator()) == 0)
                    return t1.getUser().getCity().compareTo(t2.getUser().getCity());
                else
                    return t1.getShopIdentificator().compareTo(t2.getShopIdentificator());
            return t1.getItemName().compareTo(t2.getItemName());
        });



        System.out.println(price);
        System.out.println(priceCity);
        System.out.println(itemNameShopIdentificatorUserCity);




//        treeOrders.stream().
//                sorted((t1, t2) -> t2.getPrice() - t1.getPrice()). //sort list by Order price in decrease order
//                filter((t -> t.getPrice() >= 1500)).distinct().    //delete items where price less than 1500
//                filter((t -> t.getCurrency() != USD)).distinct().  //delete orders where currency is USD
//                forEach(System.out::println);
    }
}
