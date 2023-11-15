package bai2;
import java.util.Scanner;

public class May {
    static Scanner sc = new Scanner(System.in);
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public May() {

    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void nhap() {
        System.out.print("ID of Machine: ");
        this.maMay = sc.nextInt();
        sc.nextLine();
        System.out.print("Type of machine: ");
        this.kieuMay = sc.nextLine();
        System.out.print("Machine status: ");
        this.tinhTrang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Information of Machine: ");
        System.out.println("ID: " + this.maMay);
        System.out.println("Type: " + this.kieuMay);
        System.out.println("Machine: " + this.tinhTrang);
    }
}
