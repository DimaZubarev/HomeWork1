package module3.task4;


public class Main {

     private static User Dima = new User("Dima", 22500, 10, "Star", 1000, "USD");

    public static void main(String[] args) {

        Dima.paySalary();
        Dima.withdraw(2500);
        Dima.monthIncrease(1);
        companyNameLength();
    }

    private static void companyNameLength () {
        Dima.getCompanyName().length();
    }

}
