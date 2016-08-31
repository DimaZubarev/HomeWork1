package module3.task4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {return name;}

    public int getBalance() {return balance;}

    public int getMonthsOfEmployment() {return monthsOfEmployment;}

    public String getCompanyName() {return companyName;}

    public int getSalary() {return salary;}

    public String getCurrency() {return currency;}

    public static void main(String[] args) {

        User Dima = new User("Dima", 22500, 10, "Star", 1000, "USD");}

        void paySalary() {balance = balance + salary;}
        void withdraw() {}
}
