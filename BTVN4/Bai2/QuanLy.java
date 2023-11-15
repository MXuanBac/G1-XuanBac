package bai2;
import java.util.Scanner;

public class QuanLy {
    static Scanner sc = new Scanner(System.in);
    private String maQL;
    private String tenQl;

    public QuanLy(String maQL, String tenQl) {
        this.maQL = maQL;
        this.tenQl = tenQl;
    }

    public QuanLy() {

    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getTenQl() {
        return tenQl;
    }

    public void setTenQl(String tenQl) {
        this.tenQl = tenQl;
    }

    public void nhap(){
        System.out.print("ID of manager: ");
        this.maQL = sc.nextLine();
        System.out.print("Name of manager: ");
        this.tenQl = sc.nextLine();
    }
    public void xuat() {
        System.out.println("Information of Manager: ");
        System.out.println("ID: " + this.maQL);
        System.out.println("Name: " + this.tenQl);
    }
}
