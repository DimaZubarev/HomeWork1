package module4;

public class BankSystemImpl implements BankSystem{

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank  = user.getBank();
        if (userBank.LimitOfFunding() >= amount + userBank.Commission(amount)){
            double newBalance = user.getBalance() - amount - userBank.Commission(amount);
            user.setBalance(newBalance);
        }

    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        double newBalance = user.getBalance() + amount;
        user.setBalance(newBalance);
    }



    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank fromUserBank = fromUser.getBank();
        Bank toUserBank = toUser.getBank();
        double commission = fromUserBank.Commission(amount) * 0.03;
        int fund = toUserBank.LimitOfFunding();
        if (fromUserBank.LimitOfWithdrawal() >= amount * commission) {
            if (fund >= amount || fund == 0) fromUser.setBalance(fromUser.getBalance() - amount * commission);
            toUser.setBalance(toUser.getBalance() + amount);
        }



    }

    @Override
    public void paySalary(User user) {
        Bank userBank = user.getBank();
        double newBalance = user.getBalance() + user.getSalary();
        user.setBalance(newBalance);


    }
}
