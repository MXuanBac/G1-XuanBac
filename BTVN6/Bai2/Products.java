package BTVN.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Products {
    private static ArrayList<Products> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private Integer id;
    private String nameProduct;
    private String unit;
    private int quantity;
    private int unitPrice;
    static int cnt = 0;
    public Products(String nameProduct, String unit, int quantity, int unitPrice) {
        this.id = cnt++;
        this.nameProduct = nameProduct;
        this.unit = unit;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Products() {
        this.id = cnt++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void input(){
        System.out.print("Enter number of products: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < num ; i++) {
            System.out.print("Enter name's product " + (i + 1) + " : ");
            this.nameProduct = sc.nextLine();
            System.out.print("Enter unit : ");
            this.unit = sc.nextLine();
            System.out.print("Enter quantity : ");
            this.quantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter unit price : ");
            this.unitPrice = sc.nextInt();
            sc.nextLine();
            Products p = new Products(nameProduct, unit, quantity, unitPrice);
            list.add(p);
            System.out.println();
        }
    }

    public int total(){
        return quantity * unitPrice;
    }

    public void output(){
        System.out.printf("%-5s %-25s %-15s %-15s %-15s %-20s %-20s\n" , "STT" , "| Tên hàng hóa , dịch vụ" , "|Đơn vị tính" , "|Số lượng" , "|Đơn giá" , "|Thành tiền" ,"|");
        for (Products x: list) {
            System.out.printf("%-5s| %-25s| %-15s| %-15d| %-15d| %-20d%-20s\n", x.id, x.nameProduct, x.unit, x.quantity, x.unitPrice, x.total(), "|");
            System.out.println( "______________________________");
        }
        System.out.println("Tổng tiền thanh toán : " + this.bill());
    }
    public int bill(){
        int sum = 0;
        for (Products x : list) {
            sum += x.total();
        }
        return sum;
    }
}
