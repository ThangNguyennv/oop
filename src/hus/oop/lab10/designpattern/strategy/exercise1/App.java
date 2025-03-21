package hus.oop.lab10.designpattern.strategy.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        PayStrategy strategy = null;

        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.println("Please, select a product:" + "\n" +
                        "1 - Motherboard" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.println("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.println("Do you wish to continue selecting products? Y/N:");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - Paypal" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();
                if (paymentMethod.equals("1")) {
                    strategy = PayByPaypal.getInstance();
                    order.processOrderUsingPaypal((PayByPaypal) strategy);

                } else {
                    strategy = PayByCreditCard.getInstance();
                    order.processOrderUsingCreditCard((PayByCreditCard) strategy);
                }
            }
            System.out.println("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                order.setClosed();
            }
        }
    }
}
