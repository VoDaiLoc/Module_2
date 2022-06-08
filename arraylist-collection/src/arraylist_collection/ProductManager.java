package arraylist_collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class ProductManager {

    private ArrayList<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        long id = System.currentTimeMillis() / 1000;
        System.out.println("Nhập tên sản phẩm muốn thêm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm muốn thêm: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        productList.add(product);
    }

    public void editProduct() {
        System.out.println("Nhập ID của sản phẩm muốn sửa: ");
        long id = Long.parseLong(scanner.nextLine());
        for (Product product : productList
        ) {
            if (product.getId() == id) {
                System.out.println("Nhập tên sản phẩm mới: ");
                String name = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm mới: ");
                double price = Double.parseDouble(scanner.nextLine());
                product.setName(name);
                product.setPrice(price);
            }
        }
    }

    public void removeProduct() {
        System.out.println("Nhập ID của sản phẩm muốn xóa: ");
        long id = Long.parseLong(scanner.nextLine());
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                return;
            }
        }
    }

    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm: ");
        String qwerty = scanner.nextLine();
        System.out.printf("%-20s %-20s %-20s \n", "ID", "Tên SP", "Giá SP");
        for (Product product : productList) {
            if (product.getName().contains(qwerty)) {
                System.out.printf("%-20d %-20s %-20.2f \n", product.getId(), product.getName(), product.getPrice());
            }
        }
    }

    public void sortByPriceASC() {
        List<Product> newProductList = new ArrayList<>(productList);
        Comparator<Product> priceASC = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o1.getPrice() - o2.getPrice();
                return result == 0 ? 0 : (result > 0 ? 1 : -1);
            }
        };
        newProductList.sort(priceASC);
        System.out.printf("%-20s %-20s %-20s \n", "ID", "Tên SP", "Giá SP");
        for (Product product : newProductList) {
            System.out.printf("%-20d %-20s %-20.2f \n", product.getId(), product.getName(), product.getPrice());
        }
    }

    public void sortByPriceDESC() {
        List<Product> newProductList = new ArrayList<>(productList);
        Comparator<Product> priceASC = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o2.getPrice() - o1.getPrice();
                return result == 0 ? 0 : (result > 0 ? 1 : -1);
            }
        };
        newProductList.sort(priceASC);
        System.out.printf("%-20s %-20s %-20s \n", "ID", "Tên SP", "Giá SP");
        for (Product product : newProductList) {
            System.out.printf("%-20d %-20s %-20.2f \n", product.getId(), product.getName(), product.getPrice());
        }
    }

    public void showProduct() {
        System.out.printf("%-20s %-20s %-20s \n", "ID", "Tên SP", "Giá SP");
        for (Product product : productList) {
            System.out.printf("%-20d %-20s %-20.2f \n", product.getId(), product.getName(), product.getPrice());
        }
    }
}
