package module9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static module9.Currency.USD;

public class Main {

    public static void main(String[] args) {

        List<Order> listOrders = new ArrayList<>();
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

        listOrders.add(new Order(54968460, 1560, Currency.UAH, "Opel", "Opel Motors", listUsers.get(8)));
        listOrders.add(new Order(54968461, 2500, Currency.UAH, "VW", "VW Motors", listUsers.get(1)));
        listOrders.add(new Order(54968462, 3000, USD, "Kia", "Kia Motors", listUsers.get(0)));
        listOrders.add(new Order(54968463, 2760, USD, "Volvo", "Volvo Motors", listUsers.get(2)));
        listOrders.add(new Order(54968464, 1450, USD, "Suzuki", "Suzuki Motors", listUsers.get(3)));
        listOrders.add(new Order(54968465, 5000, USD, "Audi", "Audi Motors", listUsers.get(9)));
        listOrders.add(new Order(54968466, 2460, Currency.UAH, "BMW", "BMW Motors", listUsers.get(7)));
        listOrders.add(new Order(54968467, 4460, USD, "Mersedes", "Mersedes Motors", listUsers.get(5)));
        listOrders.add(new Order(54968447, 4360, USD, "Mersedes", "Mersedes Motors", listUsers.get(5)));
        listOrders.add(new Order(54968460, 1570, Currency.UAH, "Opel", "Opel Motors", listUsers.get(4)));
        listOrders.add(new Order(54968460, 1560, Currency.UAH, "Opel", "Opel Motors", listUsers.get(8)));



        List<Order> price = listOrders.stream().sorted((t1, t2) -> Integer.compare( t2.getPrice(), t1.getPrice())).collect(Collectors.toList());//sort list by Order price in decrease order

        List<Order> priceAndCity = listOrders.stream().sorted((order1, order2) -> {
            if (order1.getPrice() - order2.getPrice() == 0)
                return order1.getUser().getCity().compareTo(order2.getUser().getCity());
            return order1.getPrice() - order2.getPrice();
        }).collect(Collectors.toList());

        List <Order> itemNameShopIdentificatorUserCity =listOrders.stream().sorted((order1, order2) -> {
            if (order1.getItemName().compareTo(order2.getItemName()) == 0)
                if (order1.getShopIdentificator().compareTo(order2.getShopIdentificator()) == 0)
                    return order1.getUser().getCity().compareTo(order2.getUser().getCity());
                else
                    return order1.getShopIdentificator().compareTo(order2.getShopIdentificator());
            return order1.getItemName().compareTo(order2.getItemName());
        }).collect(Collectors.toList());

        List<Order> deleteDuplicates = listOrders.stream().distinct().collect(Collectors.toList()); // distinct() видаляє дуплікати

        List<Order> deleteItems = listOrders.stream().filter((order -> order.getPrice() >= 1500)).collect(Collectors.toList());   //delete items where price less than 1500

        List<Order> deleteOrdersUSD = listOrders.stream().filter((order -> order.getCurrency() != USD)).collect(Collectors.toList());  //delete orders where currency is USD

        System.out.println(price);
        System.out.println(priceAndCity);
        System.out.println(itemNameShopIdentificatorUserCity);
        System.out.println(deleteDuplicates);
        System.out.println(deleteItems);
        System.out.println(deleteOrdersUSD);
        System.out.println();

    }

    private static Map <String, List<Order>> separateUniqueCitys (List<Order> orders) {
        Function<Order, String> function = order -> order.getUser().getCity();
        Map<String, List<Order>> result = orders.stream().collect(Collectors.groupingBy(function));
        return result;
    }
}
