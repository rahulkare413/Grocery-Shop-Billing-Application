package app2;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GroceryShop gsb = new GroceryShop(0, 0.0, 0.0, 0.0, 0.0);

        LogicalClass billingLogic = new LogicalClass(gsb);

        int choice = 0;

        while (choice != 3) {
            System.out.println("1 Add new item");
            System.out.println("2 Display bill");
            System.out.println("3 Exit Program");
            System.out.print("Please enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Bath Soap (15 Rs per piece)");
                    System.out.println("2. Biscuit (40 Rs per pack)");
                    System.out.println("3. Rice (35 Rs per kg)");
                    System.out.println("4. Sugar (55 Rs per kg)");
                    System.out.println("5. Oil (27 Rs per liter)");
                    System.out.print("Please enter product number: ");
                    int productNumber = sc.nextInt();
                    System.out.print("Please enter quantity: ");
                    double quantity = sc.nextDouble();

                    billingLogic.addItem(productNumber, quantity);
                    break;

                case 2:
                    billingLogic.displayBill();
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
