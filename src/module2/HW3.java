package module2;

/*You need to write method which withdraw money of particular account owner if he/she can.
Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case. Commision is 5% for all cases.

        Example

        Input                                                             Input

        int[] balances = {1200, 250, 2000, 500, 3200};                    int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};     String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = Ann                                            String ownerName = Oww
        double withdrawal = 100;                                          double withdrawal = 490;

        Output                                                            Output
        Ann 100 145                                                       Oww NO
*/

public class HW3 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        double comis = 1.05;
        String ownerName1 = "Ann";
        double withdrawal1 = 100;

        String ownerName2 = "Oww";
        double withdrawal2 = 490;

        withdrawMoney(ownerNames, ownerName1, balances, withdrawal1, comis);
        withdrawMoney(ownerNames, ownerName2, balances, withdrawal2, comis);

    }

    static void withdrawMoney(String ownerNames[], String ownerName, int balances[], double withdrawal, double comis) {
        double sumBalanse = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                sumBalanse = (balances[i] - withdrawal * comis);
                if (sumBalanse > 0) {
                    balances[i]=(int)sumBalanse;
                    System.out.println(ownerNames[i] + " " + withdrawal + " " + balances[i]);
                } else {
                    System.out.println(ownerNames[i] + " NO");
                }
                break;
            }
        }
    }
}
