package arraylist_collection;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager = new ProductManager();
    int choice;

    public void mainMenu() {
        do {
            System.out.println(" * * * * * * * Main Menu * * * * * * * * ");
            System.out.println(" *                                     * ");
            System.out.println(" *     1. Quản lý người dùng           * ");
            System.out.println(" *     2. Quản lý sản phẩm             * ");
            System.out.println(" *     3. Quản lý đơn đặt hàng         * ");
            System.out.println(" *     0. Thoát                        * ");
            System.out.println(" *                                     * ");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    userMenu();
                    break;
                case 2:
                    cakeManager();
                    break;
                case 3:
                    orderManager();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn đúng chức năng!");
            }
        } while (true);
    }

    public void userMenu() {
        do {
            System.out.println(" * * * * * *  User Manager * * * * * * *");
            System.out.println(" *                                     * ");
            System.out.println(" *     1. Thêm người dùng              * ");
            System.out.println(" *     2. Sửa thông tin người dùng     * ");
            System.out.println(" *     3. Hiện danh sách người dùng    * ");
            System.out.println(" *     0. Quay lại                     * ");
            System.out.println(" *                                     * ");
            System.out.println(" * * * * * * * * * * * * * * * * * * * *");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng!");
            }
        } while (choice != 0);
    }

    public void cakeManager() {
        do {
            System.out.println(" * * * * * *  Cake Manager * * * * * * * ");
            System.out.println(" *                                     * ");
            System.out.println(" *     1. Thêm sản phẩm                * ");
            System.out.println(" *     2. Sửa thông tin sản phẩm       * ");
            System.out.println(" *     3. Hiện thông tin sản phẩm      * ");
            System.out.println(" *     4. Xóa sản phẩm                 * ");
            System.out.println(" *     5. Tìm kiếm sản phẩm            * ");
            System.out.println(" *     6. Sắp xếp sản phẩm             * ");
            System.out.println(" *     0. Quay lại                     * ");
            System.out.println(" *                                     * ");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editProduct();
                    break;
                case 3:
                    productManager.showProduct();
                    break;
                case 4:
                    productManager.removeProduct();
                    break;
                case 5:
                    productManager.searchProduct();
                    break;
                case 6:
                    sortManager();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng!");
                    break;
            }
        } while (choice != 0);
    }

    public void orderManager() {
        do {
            System.out.println(" * * * * * *  Order Manager  * * * * * * ");
            System.out.println(" *                                     * ");
            System.out.println(" *    1. Thêm đơn hàng                 * ");
            System.out.println(" *    2. Xóa đơn hàng                  * ");
            System.out.println(" *    3. Hiện danh sách đơn hàng       * ");
            System.out.println(" *    0. Quay lại                      * ");
            System.out.println(" *                                     * ");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng!");
            }
        } while (choice != 0);
    }

    public void sortManager() {
        do {
            System.out.println(" * * * * * *  Sort Manager * * * * * * *");
            System.out.println(" *                                     * ");
            System.out.println(" *    1. Sắp xếp theo chiều tăng dần   * ");
            System.out.println(" *    2. Sắp xếp theo chiều giảm dần   * ");
            System.out.println(" *    0. Quay lại                      * ");
            System.out.println(" *                                     * ");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.sortByPriceASC();
                    break;
                case 2:
                    productManager.sortByPriceDESC();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng!");
            }
        } while (choice != 0);
    }
}
