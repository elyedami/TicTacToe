import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems = true;
        while (moreItems) {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.5, 10.0);
            totalCost += itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items to enter?");
        }
        System.out.printf("\nTotal cost: $%.2f%n", totalCost);
    }
}