package module7.task2;

import java.util.*;

public class Controller {

    List<User> listUsers = new ArrayList<>();
    List<Order> listOrders = new ArrayList<>();
    List<String> citysList = new ArrayList<>();

    public Controller() {

        listUsers.add(new User("Bob", "Bobov", "Kyiv", 5954));
        listUsers.add(new User("Bim", "Bimov", "Kyiv", 6954));
        listUsers.add(new User("Bil", "Bilov", "Kyiv", 7954));
        listUsers.add(new User("Den", "Denov", "Dnepr", 4954));
        listUsers.add(new User("Max", "Maxov", "Dnepr", 5854));
        listUsers.add(new User("Djon", "Djonov", "Odesa", 7854));
        listUsers.add(new User("Abram", "Abramov", "Odesa", 7754));
        listUsers.add(new User("Anton", "Antonov", "Lviv", 15954));
        listUsers.add(new User("Semen", "Semenov", "Lviv", 16954));
        listUsers.add(new User("Alex", "Alexov", "Lviv", 17954));

        listOrders.add(new Order(54968460, 1560, Currency.UAH, "Hyundai", "Hyundai Motors", listUsers.get(8)));
        listOrders.add(new Order(54968461, 2500, Currency.UAH, "VW", "VW Motors", listUsers.get(1)));
        listOrders.add(new Order(54968462, 3000, Currency.USD, "Kia", "Kia Motors", listUsers.get(0)));
        listOrders.add(new Order(54968463, 2760, Currency.USD, "Hyundai", "Volvo Motors", listUsers.get(2)));
        listOrders.add(new Order(54968464, 1560, Currency.USD, "Suzuki", "Suzuki Motors", listUsers.get(3)));
        listOrders.add(new Order(54968465, 500, Currency.USD, "Hyundai", "Volvo Motors", listUsers.get(9)));
        listOrders.add(new Order(54968466, 2460, Currency.UAH, "BMW", "BMW Motors", listUsers.get(7)));
        listOrders.add(new Order(54968467, 4360, Currency.USD, "Mersedes", "Mersedes Motors", listUsers.get(5)));
        listOrders.add(new Order(54968468, 1560, Currency.UAH, "Skoda", "Skoda Motors", listUsers.get(6)));
        listOrders.add(new Order(54968469, 3100, Currency.USD, "Hyundai", "Hyundai Motors", listUsers.get(4)));
    }

    void price() {
        Comparator<Order> decreaseOrder = new Comparator<Order>() { // від великой до малой ціни
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };
        listOrders.sort(decreaseOrder);
        System.out.println("  price");
        for (Order order : listOrders) {
            System.out.println(order);
        }
    }

    void priceAndCity() {
        Collections.sort(listOrders, new Comparator<Order>() { // від малой до великой ціни та по містам
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() - o2.getPrice() == 0)
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println(" priceAndCity");
        for (Order order : listOrders) {
            System.out.println(order);
        }
    }

    void itemNameShopIdentificatorUserCity() {
        Collections.sort(listOrders, new Comparator<Order>() { // сортування по назві товару, назві магазину та місту покупця
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().compareTo(o2.getItemName()) == 0)
                    if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0)
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    else
                        return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());

                return o1.getItemName().compareTo(o2.getItemName());
            }
        });
        System.out.println(" itemNameShopIdentificatorUserCity");
        for (Order order : listOrders) {
            System.out.println(order);
        }
    }

    void deleteDuplicates() {
        Set<Order> deleteDuplicates = new HashSet<>();
        deleteDuplicates.addAll(listOrders);
        System.out.println(" deleteDuplicates");
        for (Order order : deleteDuplicates) {
            System.out.println(order);
        }
    }

    void deleteItems (int price) {
        Iterator<Order> iterator = listOrders.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getPrice() < 1500)
                iterator.remove();
        }
        System.out.println(" deleteItems");
        for (Order order : listOrders) {
           System.out.println(order);
        }
    }

    void separateList() {
        List<Order> usd = new ArrayList<>();
        List<Order> uah = new ArrayList<>();
        for (Order order : listOrders) {
            if (order.getCurrency() == Currency.USD) usd.add(order);
            else uah.add(order);
        }
        for (Order order : usd) {
            System.out.println("USD" + order);
        }
        for (Order order : uah) {
            System.out.println("UAH" + order);
        }
    }

    void separateUniqueSitys() {
        Set<String> citysUnique = new HashSet<>();
        for (User user : listUsers) {
            citysUnique.add(user.getCity());
        }
        List<List<Order>> ordersByCitys = new ArrayList<>();
        for (String city : citysUnique){
            List<Order> ordersForCity = new ArrayList<>();
            for (Order order : listOrders){
                if (order.getUser().getCity().equals(city)){
                    ordersForCity.add(order);
                }
            }
            ordersByCitys.add(ordersForCity);
        }
        System.out.println(citysUnique.size());
        System.out.println(ordersByCitys.size());
    }


}

