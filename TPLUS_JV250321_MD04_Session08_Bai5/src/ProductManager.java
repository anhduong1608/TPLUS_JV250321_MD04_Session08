import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private static final ArrayList<Product> products = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    private static int nextId = 1;

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showAllProducts();
                    break;
                case 3:
                    findProduct();
                    break;
                case 4:
                    System.out.println("thoát");
                    return;
                default:
                    System.out.println("lựa chọn của bạn.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("******Menu******");
        System.out.println("1.thêm sản phẩm");
        System.out.println("2.hiển thị sản phẩm ");
        System.out.println("3.tìm sản phẩm");
        System.out.println("4. thoát");
        System.out.print("lựa chọn của bạn: ");
    }

    private static int getUserChoice() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    private static void addProduct() {
        System.out.print("nhập tên sản phẩm ");
        String name = sc.nextLine();
        System.out.print("nhập giá sản phẩm ");
        double price = sc.nextDouble();
        sc.nextLine();
        products.add(new Product(nextId++, name, price));
        System.out.println("thêm thành công");
    }

    private static void showAllProducts() {
        if (products.isEmpty()) {
            System.out.println("sản phẩm không tồn tại");
            return;
        }

        System.out.println("danh sách sản phẩm");
        for (Product product : products) {
            product.display();
        }
    }

    private static void findProduct() {
        System.out.print("nhập thên sản phẩm cần tìm ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(searchName)) {
                System.out.println("sản phẩm được tìm thấy:");
                product.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("không tìm thấy sản phẩm");
        }
    }
}

// Product class moved to the bottom
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: $" + price);
    }
}

