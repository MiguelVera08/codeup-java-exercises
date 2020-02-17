package groceries;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceriesApplication {

    final static ArrayList<Product> groceryStock = new ArrayList<>();

    static class Product {
        private String description;
        private String department;
        private double price;
        private String unit;
        private int count;

        public Product(String description, String department, double price, String unit, int count) {
            this.description = description;
            this.department = department;
            this.price = price;
            this.unit = unit;
            this.count = count;
        };

        public Product(Product product) {
            this.description = product.description;
            this.department = product.department;
            this.price = product.price;
            this.unit = product.unit;
            this.count = product.count;
        }

        ;

        public String toString() {
            String product;
            switch (count) {
                case (0):
                    product = String.format("%s -- %s -- %.2f %s", this.description, this.department, this.price, this.unit);
                    break;
                default:
                    product = String.format("%d X %s -- %s -- %.2f %s", this.count, this.description, this.department, this.price, this.unit);
                    break;
            }
            return product;
        }

        public String getDescription() {
            return description;
        }

        public String getDepartment() {
            return department;
        }

        public double getPrice() {
            return price;
        }

        public String getUnit() {
            return unit;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public static void printList(List<Product> products) {
            System.out.println("Your Grocery List\n");
            for (Product product : products) {
                System.out.println("\t" + product.toString());
            }
            System.out.println("\n");
        }

        public static void removeItem(List<Product> products, Scanner scanner) {

            while (true) {
                System.out.println("\n\nRemove which item?\n");
                System.out.println("\t0 - Exit remove mode");
                int option = 1;
                for (Product product : products) {
                    System.out.println("\t(" + option + ") -- " + product.toString());
                    option++;
                }
                int choice = 0;
                System.out.println();
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException nfe) {
                    System.out.println("That is an invalid response");
                    continue;
                }
                if (choice == 0) break;
                choice--;
                if (choice > (products.size() - 1)) {
                    System.out.println(choice + " is out of range");
                    continue;
                } else {
                    products.remove(choice);
                }
            }
        }
    }

    private static ArrayList<Product> buildGroceryStocks() {
        groceryStock.add(new Product("Banana", "Produce", 2.99, "lb", 0));
        groceryStock.add(new Product("apples", "Produce", 1.49, "lb", 0));
        groceryStock.add(new Product("Strawberry", "Produce", 2.49, "lb", 0));
        groceryStock.add(new Product("onion", "Produce", 1.00, "Each", 0));
        groceryStock.add(new Product("Tomato", "Produce", 2.35, "lb", 0));
        groceryStock.add(new Product("grapes", "Produce", 4.00, "lb", 0));
        groceryStock.add(new Product("Lettuce", "Produce", 0.79, "lb", 0));
        groceryStock.add(new Product("bread", "Grocery", 1.50, "Each", 0));
        groceryStock.add(new Product("hamburger buns", "Grocery", 1.75, "Each", 0));
        groceryStock.add(new Product("pasta sauce", "Grocery", 3.75, "Each", 0));
        groceryStock.add(new Product("cheese slices", "Grocery", 2.68, "Each", 0));
        groceryStock.add(new Product("sliced turkey", "Grocery", 3.29, "Each", 0));
        groceryStock.add(new Product("tortilla chips", "Grocery", 1.99, "Each", 0));
        groceryStock.add(new Product("cereal", "Grocery", 3.19, "Each", 0));
        groceryStock.add(new Product("canned vegtables", "Grocery", 1.89, "Each", 0));
        groceryStock.add(new Product("headache medicine", "Pharmacy", 4.89, "Each", 0));
        groceryStock.add(new Product("Migraine Medicine", "Pharmacy", 5.89, "Each", 0));
        groceryStock.add(new Product("Cold and Flu", "Pharmacy", 3.29, "Each", 0));
        groceryStock.add(new Product("Allegry Medicine", "Pharmacy", 3.00, "Each", 0));
        groceryStock.add(new Product("Pain", "Pharmacy", 2.89, "Each", 0));
        return groceryStock;
    }

    public static List<Product> createList(Scanner scanner) {

        // setup list
        ArrayList<Product> products = buildGroceryStocks();
        ArrayList<Product> productList = new ArrayList<>();
        final int PRESET_OPTION_COUNT = 3;

        // build option list
        int index = PRESET_OPTION_COUNT;
        String[] indexArray = new String[products.size() + PRESET_OPTION_COUNT];
        for (Product product : products) {
            indexArray[index] = product.toString();
            index++;
        }

        // loop to choose how thw list the movies
        int choice = 1;
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("\t0 - Exit list builder");
            System.out.println("\t1 - Print list");
            System.out.println("\t2 - Remove and item");
            System.out.println("\n\t...ADD....");

            // loop through students to show repos
            index = PRESET_OPTION_COUNT;
            for (Product product : products) {
                System.out.println("\t\t" + index + " - " + indexArray[index]);
                index++;
            }
            System.out.println();
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("That is an invalid response");
                continue;
            }
            if (choice > (products.size() - 1) + PRESET_OPTION_COUNT) {
                System.out.println(choice + " is out of range");
                continue;
            }

            // loop to display student information
            if (choice != 0) {
                if (choice == 1) {
                    Product.printList(productList);
                } else if (choice == 2) {
                    Product.removeItem(productList, scanner);
                } else {
                    System.out.print("How many would you like to purchase? ");
                    int count = 1;
                    try {
                        count = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException nfe) {
                        System.out.println("That is an invalid response");
                        count = 1;
                    }
                    Product newProduct = new Product(products.get(choice - PRESET_OPTION_COUNT));
                    newProduct.setCount(count);
                    productList.add(newProduct);
                }
            }
        } while (choice != 0);
        return productList;
    }

    ;

    public static void main(String[] args) {

        // Setup Main query driving application
        Scanner scanner = new Scanner(System.in);

        // loop to choose how thw list the movies
        int choice = 1;
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("\t0 - exit");
            System.out.println("\t1 - Create a grocery list");

            // loop through students to show repos
            System.out.println("");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("That is an invalid response");
                continue;
            }

            // loop to display student information
            if (choice != 0) {
                if (choice == 1) {
                    List<Product> productList = createList(scanner);
                } else {
                    System.out.println("That is an invalid response");
                }
            }

        } while (choice != 0);
        System.out.println("Goodbye");

    }

}
