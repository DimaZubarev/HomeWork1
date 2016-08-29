package module2;

/*You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding

        Input

        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = Oww
        double withdrawal = 100;

        Output
        Oww 600 */

public class HW4 {
    static void fundBalance(String ownerName, double fund, String ownerNames[], int balances[]) {

        for (int i = 0; i < balances.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                balances[i]+= fund;
                System.out.println(ownerName + " " + balances[i] );

                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double fund = 100;

        fundBalance(ownerName, fund, ownerNames, balances);
    }
}