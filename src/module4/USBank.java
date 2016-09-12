package module4;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    //Bank UsBank = new Bank(555111222, "USA", Currency.USD, 50, 3700.5, 1, 9055000);

    @Override
    int LimitOfWithdrawal() {
        int limit = 0;
        if (getCurrency() == Currency.USD) limit = 1000;
        if (getCurrency() == Currency.EUR) limit = 1200;
        return limit;
    }

    
    @Override
    int LimitOfFunding() {
        int limit = 0;
        if (getCurrency() == Currency.USD);
        if (getCurrency() == Currency.EUR) limit = 10000;
        return limit;
    }

    @Override
    double MonthlyRate(double balance) {
        double MonthlyRate = 0;
        if (getCurrency() == Currency.USD){
            MonthlyRate = balance * 1.01;}
            if (getCurrency() == Currency.EUR){
                MonthlyRate = balance * 1.02;}
        return MonthlyRate;
    }

    @Override
    double Commission(int amount) {

        double commision = 0;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) commision = 0.05;
            else {commision = 0.07;}
        }
        if (getCurrency() == Currency.EUR) {
            if (amount <= 1000) commision = 0.06;
            else {commision = 0.08;}
        }
        return commision;
    }

    @Override
    double moneyPaidMonthlyForSalary(double summ) {
        return getNumberOfEmployees() * getAvrSalaryOfEmployee();}


}


