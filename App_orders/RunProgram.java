package App_orders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RunProgram {
    private static List<Order> orders = new ArrayList<>();
    private static int serial = 1;
    private static int orderSerialCounter = 1;
    Scanner sc = new Scanner(System.in);
    public static void addOrder(Scanner sc) {
        System.out.print("Enter order date: ");
        String orderDate = sc.next();

        List<Product> products = new ArrayList<>();

        while (true) {
            System.out.print("Enter product name (or type 'done' to finish): ");
            String productName = sc.next();
            if ( productName.equals("done") ) {
                break;
            }
            System.out.print("Enter product Price: ");
            int productPrice = sc.nextInt();

            System.out.print("Enter product Quantity: ");
            int productQuantity = sc.nextInt();
            products.add(new Product(productName, productPrice, productQuantity));
        }

        Order order = new Order(orderSerialCounter++, orderDate, products);
        orders.add(order);
        System.out.println("Order added successfully!");
    }
    public static void viewOrders() {
        if ( orders.isEmpty()) {
            System.out.println("No orders available.");
        } else {
            for (Order order : orders) {
                System.out.println("Order Date: " + order.orderDate);
                System.out.println("Products:");

                for (Product product : order.products) {
                    System.out.println("  Product: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity);
                }
                System.out.println("Total Amount: " + order.calculateTotal());
                System.out.println("------------------------");
            }
        }
    }
    public static void editOrder (Scanner sc){
        System.out.print("Enter the product serial number to edit: ");
        int orderSerial = sc.nextInt();

        for (Order order : orders) {
           if (order.orderSerial == orderSerial) {
               System.out.print("Enter new order date: ");
               String newOrderDate = sc.next();

               order.orderDate = newOrderDate;

               System.out.println("Order updated successfully!");
               return;
           }
       }

       System.out.println("Order not found with serial: " + orderSerial);
   }
   public static void deleteOrder(Scanner sc){
       System.out.print("Enter the product serial number to Delete: ");
       int orderSerial = sc.nextInt();

       for (Order order : orders) {
           if ( order.orderSerial == orderSerial ) {
               orders.remove(order);
               System.out.println("Order delete successfully!");
               return;
           }
       }
   }
}
