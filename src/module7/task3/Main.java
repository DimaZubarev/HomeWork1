package module7.task3;

public class Main {
    public static void main(String[] args) {
        TreeSetController controller = new TreeSetController();

        System.out.println(controller.findLastName("Petrov"));
        controller.orderWithLargestPrice();
        controller.deleteForCurrency(Currency.USD);

    }
}
