package bai3;

import java.util.Scanner;
public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    
    public void nhap() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ma Sinh Vien: ");
        maSinhVien = input.nextLine();
        System.out.print("Ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Diem Toan: ");
        diemToan = input.nextFloat();
        System.out.print("Diem Ly: ");
        diemLy = input.nextFloat();
        System.out.print("Diem Hoa: ");
        diemHoa = input.nextFloat();
    }
    
    public float diemTB() {
        return (this.diemToan + this.diemLy + this.diemHoa)/3 ;
    }
    
    public void xuat() {
        System.out.printf("%-15s%-20s%-15s%-15s%-10s%-10s%n", maSinhVien, hoTen, diemToan, diemLy, diemHoa, diemTB());
    }
}
