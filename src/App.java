import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

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
        int count = nums.length;
        for (double i: nums) result += i;

        System.out.println("the average price is " + result/nums.length);
        System.out.println("the total price is " + result);

    }
}
