package bai3;
import java.util.Scanner;
public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;
    
    Scanner sc = new Scanner(System.in);
    
    public May() {
    }

    public May(String MaMay, String TenMay, String TinhTrang) {
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String TenMay) {
        this.TenMay = TenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    public void Nhap() {
        System.out.print("Nhập Mã Máy: ");
        MaMay = sc.nextLine();
        System.out.print("Nhập Tên Máy: ");
        TenMay = sc.nextLine();
        System.out.print("Tình trạng Máy: ");
        TinhTrang = sc.nextLine();
    }
    
    public void Xuat() {
	System.out.printf("%-10s %-10s %-20s\n", MaMay, TenMay, TinhTrang);
    }
} 
