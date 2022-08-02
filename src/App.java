import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("Please enter the price in dollars and cents $$.cc");

            while (!input.hasNextDouble()) {
                input.nextLine();
            }
            double price = input.nextDouble();

            System.out.println("Please enter another price in dollars and cents $$.cc");

            while (!input.hasNextDouble()) {
                input.nextLine();
            }
            double price2 = input.nextDouble();

            double nums[] = {price, price2};
            double result = 0;
            double count = nums.length;
            for (double i : nums) result += i;

            System.out.println("the average price is " + result / nums.length);
            System.out.println("the total price is " + result + "\n");
            //if the customer gets 2 free items, we want to set his total number of purchases to zero.
            if (price == 0 && price2 == 0) {
                count = 0;
            }

            if (price <= 0) {
                count = 1;
            }

            if (price2 <= 0) {
                count = 1;
            }

            System.out.println("Please enter your name");
            String string = input.next();
            System.out.println();
            System.out.println("Please enter hometown");
            String name = input.next();
            name += input.nextLine();
            System.out.println();

            HashMap<String, Double> hm = new HashMap<String, Double>();

            hm.put(string, 0.00);
            hm.put(name, result);

            Set<Map.Entry<String, Double>> set = hm.entrySet();
            //display the set
            for (Map.Entry<String, Double> me : set) {
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }
            System.out.println();
            //append the number of items purchased
            double value = hm.get(string);
            hm.put(string, value + count);

            System.out.println(string + " you bought " + hm.get(string) + " items.\n");
        }
    }
}
