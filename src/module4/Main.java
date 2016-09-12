package module4;

public class Main {

    public static void main(String[] args) {


        Bank USBank = new USBank (333555777, "USA", Currency.USD, 50, 2505.5, 1, 6055123);
        Bank EUBank = new EUBank(333555888, "EUR", Currency.EUR, 65, 3075.5, 2, 7098255);
        Bank ChinaBank = new ChinaBank(333555999, "China", Currency.USD, 75, 450.5, 3, 8072755);

        User Dima = new User(111222333,"Dima", 10050.5, 10, "Galaxy", 1750, USBank);
        User Alex = new User(222333444, "Alex", 8500.5, 11, "Bar", 1250, USBank);
        User Anna = new User(333222111, "Anna", 9500.5, 10, "Hotel", 1350, EUBank);
        User Aliana = new User(444333222, "Aliana", 7555.5, 1, "Motel", 950, EUBank);
        User Anton = new User (999888777, "Anton", 6555.5, 14, "Water", 1500, ChinaBank);
        User Alexandra = new User(888777666, "Alexandra", 6655.5, 15, "Energy", 1500, ChinaBank);

        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.paySalary(Dima);
        bankSystem.withdrawOfUser(Dima, 900);
        bankSystem.fundUser(Dima,1000);
        bankSystem.transferMoney(Dima, Anna, 500);
        System.out.println(Dima);

        bankSystem.paySalary(Alex);
        bankSystem.withdrawOfUser(Alex,500);
        bankSystem.fundUser(Alex,450);
        bankSystem.transferMoney(Alex, Dima, 1000);
        System.out.println(Alex);

        bankSystem.paySalary(Anna);
        bankSystem.withdrawOfUser(Anna, 450);
        bankSystem.fundUser(Anna,600);
        bankSystem.transferMoney(Anna, Dima, 400);
        System.out.println(Anna);

        bankSystem.paySalary(Aliana);
        bankSystem.withdrawOfUser(Aliana,100);
        bankSystem.fundUser(Aliana,300);
        bankSystem.transferMoney(Aliana, Anna, 100);
        System.out.println(Aliana);

        bankSystem.paySalary(Anton);
        bankSystem.withdrawOfUser(Anton, 550);
        bankSystem.fundUser(Anton, 600);
        bankSystem.transferMoney(Anton, Alexandra, 500);
        System.out.println(Anton);

        bankSystem.paySalary(Alexandra);
        bankSystem.withdrawOfUser(Alexandra,300);
        bankSystem.fundUser(Alexandra, 250);
        bankSystem.transferMoney(Alexandra, Anton, 560);
        System.out.println(Alexandra);
    }

}

