package bai3;
import java.util.Scanner;
public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private QuanLy x;
    private May[] y;
    private int n;
    Scanner input = new Scanner(System.in);
    public PhongMay() {
    }

    public PhongMay(String MaPhong, String TenPhong, double DienTich, QuanLy x, May[] y, int n) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double DienTich) {
        this.DienTich = DienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void Nhap() {
        System.out.print("Nhập Mã Phòng: ");
        this.MaPhong = input.nextLine();
        System.out.print("Nhập Tên Phòng: ");
        this.TenPhong = input.nextLine();
        System.out.print("Nhập Diện Tích: ");
        this.DienTich = input.nextDouble();
        x = new QuanLy();
        x.Nhap();
        System.out.print("Nhập số lượng máy: ");
        n = input.nextInt();
        y = new May[n];
        for (int i=0; i<n; i++) {
            System.out.println("THÔNG TIN MÁY THỨ " + (i+1));
            y[i] = new May();
            y[i].Nhap();
        }
    }
    
    public void Xuat(){
        System.out.printf("%-10s %-20s %20s\n", "Mã Phòng", "Tên Phòng", "Diện Tích");
        System.out.printf("%-10s %-20s %20s", MaPhong, TenPhong, DienTich);
        System.out.println();
	x.Xuat();
	System.out.println("\n============================ THÔNG TIN MÁY ============================");
	System.out.printf("%-10s %-10s %-20s\n", "Mã Máy", "Tên Máy", "Tình Trạng");
	for (int i = 0; i < n; i++) {
            y[i].Xuat();
	}
    }
}
