package application;

import services.*;
import java.util.Scanner;

public class OnlineShopping {

    private static ProductService productService = new ProductService();
    private static CustomerService customerService = new CustomerService();
    private static OrderService orderService = new OrderService();
    private static AdminService adminService = new AdminService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = getIntInput(scanner);

            switch (choice) {
                case 1:
                    adminMenu(scanner);
                    break;
                case 2:
                    customerMenu(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        scanner.close();
    }

    private static void adminMenu(Scanner scanner) {
        int adminChoice;

        do {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Products");
            System.out.println("4. Create Admin");
            System.out.println("5. View Admins");
            System.out.println("6. Update Order Status");
            System.out.println("7. View Orders");
            System.out.println("8. Return");
            System.out.print("Choose an option: ");
            adminChoice = getIntInput(scanner);

            switch (adminChoice) {
                case 1: addProduct(scanner); break;
                case 2: removeProduct(scanner); break;
                case 3: viewProducts(); break;
                case 4: createAdmin(scanner); break;
                case 5: viewAdmins(); break;
                case 6: updateOrderStatus(scanner); break;
                case 7: viewOrders(); break;
                case 8: System.out.println("Exiting Admin Menu..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }

        } while (adminChoice != 8);
    }

    private static void customerMenu(Scanner scanner) {
        int customerChoice;

        do {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Create Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Place Order");
            System.out.println("4. View Orders");
            System.out.println("5. View Products");
            System.out.println("6. Return");
            System.out.print("Choose an option: ");
            customerChoice = getIntInput(scanner);

            switch (customerChoice) {
                case 1: createCustomer(scanner); break;
                case 2: viewCustomers(); break;
                case 3: placeOrder(scanner); break;
                case 4: viewCustomerOrders(scanner); break;
                case 5: viewProducts(); break;
                case 6: System.out.println("Exiting Customer Menu..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }

        } while (customerChoice != 6);
    }

    // Admin Methods

    private static void addProduct(Scanner scanner) {
        System.out.print("Enter Product ID: ");
        int productId = getIntInput(scanner);

        System.out.print("Enter Product Name: ");
        String name = scanner.next();

        System.out.print("Enter Product Price: ");
        double price = getDoubleInput(scanner);

        System.out.print("Enter Stock Quantity: ");
        int stockQuantity = getIntInput(scanner);

        productService.addProduct(productId, name, price, stockQuantity);
        System.out.println("Product added successfully!");
    }

    private static void removeProduct(Scanner scanner) {
        System.out.print("Enter Product ID to remove: ");
        int productId = getIntInput(scanner);
        productService.removeProduct(productId);
        System.out.println("Product removed successfully!");
    }

    private static void viewProducts() {
        productService.viewProducts();
    }

    private static void createAdmin(Scanner scanner) {
        System.out.print("Enter Admin ID: ");
        int adminId = getIntInput(scanner);

        System.out.print("Enter Admin Username: ");
        String username = scanner.next();

        System.out.print("Enter Admin Email: ");
        String email = scanner.next();

        adminService.createAdmin(adminId, username, email);
        System.out.println("Admin created successfully!");
    }

    private static void viewAdmins() {
        adminService.viewAdmins();
    }

    private static void updateOrderStatus(Scanner scanner) {
        System.out.print("Enter Order ID: ");
        int orderId = getIntInput(scanner);

        System.out.print("Enter new status (Completed/Delivered/Cancelled): ");
        String status = scanner.next();

        orderService.updateOrderStatus(orderId, status);
        System.out.println("Order status updated successfully!");
    }

    private static void viewOrders() {
        orderService.viewAllOrders();
    }

    // Customer Methods

    private static void createCustomer(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerId = getIntInput(scanner);

        System.out.print("Enter Customer Username: ");
        String username = scanner.next();

        System.out.print("Enter Customer Email: ");
        String email = scanner.next();

        System.out.print("Enter Address: ");
        String address = scanner.next();

        customerService.createCustomer(customerId, username, email, address);
        System.out.println("Customer created successfully!");
    }

    private static void viewCustomers() {
        customerService.viewCustomers();
    }

    private static void placeOrder(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerId = getIntInput(scanner);
        customerService.placeOrder(customerId, scanner);
    }

    private static void viewCustomerOrders(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerId = getIntInput(scanner);
        customerService.viewCustomerOrders(customerId);
    }

    // Utility methods to handle invalid input

    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // discard invalid input
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // clear newline
        return value;
    }

    private static double getDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a decimal number.");
            scanner.next(); // discard invalid input
        }
        double value = scanner.nextDouble();
        scanner.nextLine(); // clear newline
        return value;
    }
}
