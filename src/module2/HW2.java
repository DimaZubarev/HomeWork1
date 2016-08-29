package module2;

/*Continue with BANK example
        2.1 Write method which withdraws money from account and takes commision 5% of the transaction.
        Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.

        Example

        Input                     Input

        balance = 100             balance = 100
        withdrawal = 10           withdrawal = 99

        Output                    Output
        OK 0.5 89.5               NO
        */

public class HW2 {

    static double withdrawsMoney(double balance, double withdrawal, double commision){
        if (balance-withdrawal-commision>=0){
            balance=balance-withdrawal-commision;
            System.out.println("Ok " +commision +" "+ balance);
        }
        else{System.out.println("NO");}
        return 0;
    }
    public static void main (String []arss){
        double balance1 = 100, balance2 = 100;
        double withdrawal1 = 10, withdrawal2 = 99;
        double commision = 0.05;

        withdrawsMoney (balance1, withdrawal1, withdrawal1*commision);
        withdrawsMoney (balance2, withdrawal2, withdrawal2*commision);
    }
}