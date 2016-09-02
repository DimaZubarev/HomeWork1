package module3.task4;


public class Main {

    public static void main(String[] args) {
        User Dima = new User("Dima", 22500, 10, "Star", 1000, "USD");

        Dima.paySalary();
        Dima.withdraw(2500);
        Dima.monthIncrease(1);
        Dima.companyNameLength();
    }



}
