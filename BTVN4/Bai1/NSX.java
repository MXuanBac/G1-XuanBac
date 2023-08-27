package bai1;

import java.util.Scanner;

public class NSX {
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;
    
    Scanner sc = new Scanner(System.in);
    
    public NSX() {
    }

    public NSX(String MaNSX, String TenNSX, String DcNSX) {
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.DcNSX = DcNSX;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getDcNSX() {
        return DcNSX;
    }

    public void setDcNSX(String DcNSX) {
        this.DcNSX = DcNSX;
    }
    
    public void Nhap() {
        System.out.print("Nhap Ma NSX: ");
        MaNSX = sc.nextLine();
        System.out.print("Nhap Ten NSX: ");
        TenNSX = sc.nextLine();
        System.out.print("Nhap Dia chi NSX: ");
        DcNSX = sc.nextLine();
    }
    
    public void Xuat() {
        System.out.println("Thong tin Nha San Xuat: ");
        System.out.println("Ma NSX: " + this.MaNSX + " / Ten NSX: " + this.TenNSX + "  /  Dia chi: " + this.DcNSX);
    }

    void Nhap(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
