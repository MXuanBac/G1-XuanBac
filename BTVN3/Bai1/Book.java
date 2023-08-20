package bai1;

import java.util.Scanner;

public class Book {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String nhaXuatBan;
    private int namXuatBan;

    public Book() {
    }

    public Book(String maSach, String tenSach, String tacGia, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap ma sach: ");
        maSach = input.nextLine();
        
        System.out.print("Nhap ten sach: ");
        tenSach = input.nextLine();
        
        System.out.print("Nhap ten tac gia: ");
        tacGia = input.nextLine();
        
        System.out.print("Nha xuat ban: ");
        nhaXuatBan = input.nextLine();
        
        System.out.print("Nam xuat ban: ");
        namXuatBan = input.nextInt();
    }
    
    public void output() {
        System.out.printf("%-10s%-20s%-15s%-15s%-10s%n", maSach, tenSach, tacGia, nhaXuatBan, namXuatBan);
    }
}
