package bai3;

import java.util.Scanner;
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong Sinh Vien: ");
        n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        
        for(int i=0; i<n; i++) {
            System.out.println("Thong tin Sinh Vien thu " + (i+1));
            sv[i] = new SinhVien();
            sv[i].nhap();
        }
        System.out.println("\n");
        System.out.printf("%-15s%-20s%-15s%-15s%-10s%-10s%n", "Ma Sinh Vien", "Ho Ten", "Diem Toan", "Diem Ly", "Diem Hoa", "Diem TB");
        for(SinhVien i: sv) {
            i.xuat();
        }
    }
    
}
