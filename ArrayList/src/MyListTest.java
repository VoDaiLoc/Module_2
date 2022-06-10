public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<String>(10);
        list.add("Milo Tran");
        list.add("Dat09");
        list.add("Ngoc Ngu Ngoc");
        list.add("Tri 18+");
        list.add(3, "Minh Meo Mo");
        list.printMyList();
//        listNames.remove(3);
//        listNames.printMyList();
//
//
//        MyList<Number> listNumber = new MyList<>(10);
//        listNumber.add(1);
//        listNumber.add(2);
//        listNumber.add(3);
//        listNumber.add(4);
//        listNumber.add(5);
//        listNumber.printMyList();
//        if (listNumber.contains(3)) {
//            System.out.println("Yes!");
//        }else System.out.println("NO!");
//        if (listNumber.contains(6)) {
//            System.out.println("Yes!");
//        }else System.out.println("NO!");
    }
}