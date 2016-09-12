package module4;


public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int LimitOfWithdrawal() {
        int limit = 0;
        if (getCurrency() == Currency.USD) limit = 100;
        if (getCurrency() == Currency.EUR) limit = 150;
        return limit;
    }

    @Override
    int LimitOfFunding() {
        int limit = 0;
        if (getCurrency() == Currency.USD); limit = 10000;
        if (getCurrency() == Currency.EUR) limit = 5000;
        return limit;
    }

    @Override
    double MonthlyRate(double balance) {
        double MonthlyRate = 0;
        if (getCurrency() == Currency.USD){MonthlyRate = balance * 1.01;}
        if (getCurrency() == Currency.EUR)
        return MonthlyRate;
        return MonthlyRate;
    }


    @Override
    double Commission(int amount) {
        double commision = 0;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) commision = 0.03;
            else {commision = 0.05;}
        }
        if (getCurrency() == Currency.EUR) {
            if (amount <= 1000) commision = 0.1;
            else {commision = 0.11;}
        }
        return commision;
    }

    @Override
    double moneyPaidMonthlyForSalary(double summ) {
        return getNumberOfEmployees() * getAvrSalaryOfEmployee();}


}

