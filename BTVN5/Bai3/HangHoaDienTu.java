package bai3;

import java.util.Scanner;

public class HangHoaDienTu extends hangHoa{
    protected int thoiGianBaoHanh;
    protected int congSuat;

    Scanner sc = new Scanner(System.in);
    
    public HangHoaDienTu() {
    }

    public HangHoaDienTu(int thoiGianBaoHanh, int congSuat, String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVl) {
        super(maHang, tenHang, soLuong, donGia, dsVl);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    
    @Override
    public void input() {
        super.input();
        System.out.print("Thời gian Bảo Hành: ");
        thoiGianBaoHanh = sc.nextInt();
        System.out.print("Công suất: ");
        congSuat = sc.nextInt();
    }
    
    @Override
    public void output(){
        super.output();
        System.out.println("Bảo hành: " + thoiGianBaoHanh + " --- Công suất: " + congSuat);
    }
}
