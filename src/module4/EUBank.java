package module4;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int LimitOfWithdrawal() {
        int limit = 0;
        if (getCurrency() == Currency.USD) limit = 2000;
        if (getCurrency() == Currency.EUR) limit = 2200;
        return limit;
    }

    @Override
    int LimitOfFunding() {
        int limit = 0;
        if (getCurrency() == Currency.USD); limit = 10000;
        if (getCurrency() == Currency.EUR) limit = 20000;
        return limit;
    }

    @Override
    double MonthlyRate(double balance) {
        double MonthlyRate = 0;
        if (getCurrency() == Currency.USD)
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
            if (amount <= 1000) commision = 0.02;
            else {commision = 0.04;}
        }
        return commision;
    }

    @Override
    double moneyPaidMonthlyForSalary( double suum) {
        return getNumberOfEmployees() * getAvrSalaryOfEmployee();
    }




}

