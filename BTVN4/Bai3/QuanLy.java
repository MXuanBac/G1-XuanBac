package bai3;
import java.util.Scanner;
public class QuanLy {
    private String MaQL;
    private String HoTen;
    Scanner sc = new Scanner(System.in);

    public QuanLy() {
    }

    public QuanLy(String MaQL, String HoTen) {
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String MaQL) {
        this.MaQL = MaQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    
    public void Nhap() {
        System.out.print("Nhập mã quản lý: ");
	MaQL = sc.nextLine();
	System.out.print("Nhập tên quản lý: ");
	HoTen = sc.nextLine();
    }
    
    public void Xuat()
    {
        System.out.printf("%-30s %-30s\n", "Mã Quản Lý", "Họ Tên");
	System.out.printf("%-30s %-30s", MaQL, HoTen);
    }
}
