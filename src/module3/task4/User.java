package module3.task4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;
    private int addMonth;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary(){
        System.out.println(balance +  salary);
    }

    /*double withdraw(int sum){
        if (sum < 1000) {return balance - sum * 1.05;}
        else{return balance - sum *1.1;}
    }*/

    void withdraw(int sum){
        if (sum < 1000){
            System.out.println(balance - sum * 1.05);
        }
        else {
            System.out.println(balance - sum * 1.1);
        }
    }

    void monthIncrease(int addMonth){
        System.out.println(monthsOfEmployment + addMonth);
    }
    /*int monthIncrease(int addMonth){
        return monthsOfEmployment + addMonth;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAddMonth() {
        return addMonth;
    }

    public void setAddMonth(int addMonth) {
        this.addMonth = addMonth;
    }
}

