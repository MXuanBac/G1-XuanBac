package bai3;

import java.util.Scanner;

public class VatLieu {
    protected String ten;
    protected String mauSac;
    protected int doCung;

    Scanner sc = new Scanner(System.in);

    public VatLieu() {
    }

    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDoCung() {
        return doCung;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }
    
    public void nhap() {
        System.out.print("Nhâp tên sản phẩm: ");
        this.ten = sc.nextLine();
        System.out.print("Màu sắc: ");
        this.mauSac = sc.nextLine();
        System.out.print("Độ cứng: ");
        this.doCung = sc.nextInt();
    }
    
    public void Xuat() {
        System.out.println("Tên sp: " + ten + " - Màu sắc: " + mauSac + " - Độ cứng: " + doCung);
    }
}
