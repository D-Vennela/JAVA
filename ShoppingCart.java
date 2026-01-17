import java.util.Scanner;

public class ShoppingCart {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int qty;
        double total;
        char currency = '$';

        System.out.print("What item would u like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would u like?: ");
        qty = scanner.nextInt();

        total = price * qty;

        System.out.println("\nYou have bought " + qty +" " + item + "/s");
        System.out.print("Your total is " + currency+total);

        scanner.close();
    }
}
