package Training;
import java.util.Scanner;
//Class is the structure that contains all the diff objects of the class in it.
//Class provides the structure where we can manipulate all the necessary object similar or attached to that perticular class
// class Product {
//     int id;
//     String name;
//     double price;
//     int quantity;

//     Product(int id, String name, double price, int quantity) {
//         this.id = id;
//         this.name = name;
//         this.price = price;
//         this.quantity = quantity;
//     }
// }

// public class OnlineShoppingApp {
//     static Product[] products = new Product[100];
//     static int count = 0;
//     static Scanner sc = new Scanner(System.in);

//     public static void addProduct() {
//         System.out.print("Enter Product ID: ");
//         int id = sc.nextInt();
//         sc.nextLine();

//         System.out.print("Enter Product Name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter Product Price: ");
//         double price = sc.nextDouble();

//         System.out.print("Enter Quantity: ");
//         int quantity = sc.nextInt();

//         products[count++] = new Product(id, name, price, quantity);

//         System.out.println("Product Added Successfully!");
//     }

//     public static void searchProduct() {
//         System.out.print("Enter Product Name to Search: ");
//         sc.nextLine();
//         String searchName = sc.nextLine();

//         boolean found = false;

//         for (int i = 0; i < count; i++) {
//             if (products[i].name.equalsIgnoreCase(searchName)) {
//                 System.out.println("\nProduct Found");
//                 System.out.println("ID: " + products[i].id);
//                 System.out.println("Name: " + products[i].name);
//                 System.out.println("Price: " + products[i].price);
//                 System.out.println("Quantity: " + products[i].quantity);
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("Product Not Found!");
//         }
//     }

//     public static double calculateBill() {
//         double total = 0;

//         for (int i = 0; i < count; i++) {
//             total += products[i].price * products[i].quantity;
//         }

//         return total;
//     }

//     public static void generateBill() {
//         System.out.println("\n------ BILL ------");
//         System.out.printf("%-5s %-15s %-10s %-10s %-10s\n",
//                 "ID", "Name", "Price", "Qty", "Amount");

//         for (int i = 0; i < count; i++) {
//             double amount = products[i].price * products[i].quantity;

//             System.out.printf("%-5d %-15s %-10.2f %-10d %-10.2f\n",
//                     products[i].id,
//                     products[i].name,
//                     products[i].price,
//                     products[i].quantity,
//                     amount);
//         }

//         System.out.println("----------------------------");
//         System.out.println("Total Bill = ₹" + calculateBill());
//     }

//     public static void main(String[] args) {
//         int choice;

//         do {
//             System.out.println("\n===== ONLINE SHOPPING APP =====");
//             System.out.println("1. Add Product");
//             System.out.println("2. Search Product");
//             System.out.println("3. Calculate Bill");
//             System.out.println("4. Generate Bill");
//             System.out.println("5. Exit");
//             System.out.print("Enter Choice: ");

//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     addProduct();
//                     break;

//                 case 2:
//                     searchProduct();
//                     break;

//                 case 3:
//                     System.out.println("Total Bill = ₹" + calculateBill());
//                     break;

//                 case 4:
//                     generateBill();
//                     break;

//                 case 5:
//                     System.out.println("Thank You!");
//                     break;

//                 default:
//                     System.out.println("Invalid Choice!");
//             }

//         } while (choice != 5);
//     }
// }

import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Price: ₹" + price +
                ", Quantity: " + quantity);
    }
}

public class OnlineShoppingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[10];
        int count = 0;

        double totalSales = 0;
        int totalOrders = 0;

        int choice;

        do {
            System.out.println("\n===== ONLINE SHOPPING SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Purchase Product");
            System.out.println("5. Calculate Inventory Value");
            System.out.println("6. Generate Order Summary");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < products.length) {

                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();

                        sc.nextLine(); // consume newline

                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Product Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter Product Quantity: ");
                        int quantity = sc.nextInt();

                        products[count] = new Product(id, name, price, quantity);
                        count++;

                        System.out.println("Product Added Successfully!");
                    } else {
                        System.out.println("Inventory is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Products Available!");
                    } else {
                        System.out.println("\n===== PRODUCT LIST =====");
                        for (int i = 0; i < count; i++) {
                            products[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (products[i].id == searchId) {
                            System.out.println("\nProduct Found:");
                            products[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();

                    System.out.print("Enter Quantity to Purchase: ");
                    int purchaseQty = sc.nextInt();

                    boolean purchased = false;

                    for (int i = 0; i < count; i++) {

                        if (products[i].id == productId) {

                            if (products[i].quantity >= purchaseQty) {

                                double bill = products[i].price * purchaseQty;

                                products[i].quantity -= purchaseQty;

                                totalSales += bill;
                                totalOrders++;

                                System.out.println("\nPurchase Successful!");
                                System.out.println("Product Name : " + products[i].name);
                                System.out.println("Quantity     : " + purchaseQty);
                                System.out.println("Total Bill   : ₹" + bill);

                            } else {
                                System.out.println("Insufficient Stock!");
                            }

                            purchased = true;
                            break;
                        }
                    }

                    if (!purchased) {
                        System.out.println("Product Not Found!");
                    }

                    break;

                case 5:
                    double inventoryValue = 0;

                    for (int i = 0; i < count; i++) {
                        inventoryValue += products[i].price * products[i].quantity;
                    }

                    System.out.println("Total Inventory Value = ₹" + inventoryValue);
                    break;

                case 6:
                    System.out.println("\n===== ORDER SUMMARY =====");

                    System.out.println("Total Orders Placed : " + totalOrders);
                    System.out.println("Total Sales Amount  : ₹" + totalSales);

                    System.out.println("\nCurrent Product Stock:");

                    if (count == 0) {
                        System.out.println("No Products Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            products[i].display();
                        }
                    }

                    break;

                case 7:
                    System.out.println("Thank You for Using Online Shopping System!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
