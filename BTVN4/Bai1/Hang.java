package bai1;

import java.util.Scanner;

public class Hang {
    private String MaHang;
    private String Tenhang;
    private NSX x;

    Scanner input = new Scanner(System.in);
    
    public Hang() {
    }

    public Hang(String MaHang, String Tenhang, NSX x) {
        this.MaHang = MaHang;
        this.Tenhang = Tenhang;
        this.x = x;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenhang() {
        return Tenhang;
    }

    public void setTenhang(String Tenhang) {
        this.Tenhang = Tenhang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }
    
    public void Nhap() {
        System.out.print("Nhap Ma Hang: ");
        MaHang = input.nextLine();
        System.out.print("Nhap Ten Hang: ");
        Tenhang = input.nextLine();
        x = new NSX();
        x.Nhap();
    }
    
    public void Xuat() {
        System.out.println("Ma Hang: " + this.MaHang);
        System.out.println("Ten Hang: " + this.Tenhang);
        x.Xuat();
    }
}
