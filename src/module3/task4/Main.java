package module3.task4;


public class Main {

     private static User Dima = new User("Dima", 22500, 10, "Star", 1000, "USD");

    public static void main(String[] args) {

        Dima.paySalary();
        Dima.withdraw(2500);
        nameCompany();
        //Dima.monthIncreaser(10);
        companyNameLenfht();
    }

    private static void nameCompany() {
        Dima.getCompanyName();
    }

    private static void companyNameLenfht() {
        Dima.getCompanyName().length();
    }

}
