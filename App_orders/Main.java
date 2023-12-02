package App_orders;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==================================");
            System.out.println("WELCOME TO TASK MANAGEMENT");
            System.out.println("==================================");
            System.out.println("1. Add product");
            System.out.println("2. View list product ");
            System.out.println("3. Update product to list");
            System.out.println("4. Delete product");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD PRODUCT");
                    RunProgram.addOrder(sc);
                    break;

                case 2:
                    System.out.println("VIEW PRODUCT");
                    RunProgram.viewOrders();
                    break;
                case 3:
                    System.out.println("UPDATE PRODUCT");
                    RunProgram.editOrder(sc);
                    break;
                case 4:
                    System.out.println("DELETE PRODUCT");
                    RunProgram.deleteOrder(sc);
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}