package bai3;

import java.util.Scanner;

public class hangHoa {
    private String maHang;
    private String tenHang;
    private float soLuong;
    private float donGia;
    private VatLieu[] dsVl;
    
    Scanner sc = new Scanner(System.in);
    
    public hangHoa() {
    }

    public hangHoa(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVl) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dsVl = dsVl;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public VatLieu[] getDsVl() {
        return dsVl;
    }

    public void setDsVl(VatLieu[] dsVl) {
        this.dsVl = dsVl;
    }
    
    public void input() {
        System.out.print("Nhập mã hàng:");
        maHang = sc.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();
        int n = (int) soLuong;
        dsVl = new VatLieu[n];
        
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextFloat();
        
        System.out.println("");
        for(int i=0; i<soLuong; i++)
        {
            System.out.println("Thông tin Vật Liệu thứ "+(i+1));
            dsVl[i]  = new VatLieu();
            dsVl[i].nhap();
        }
    }
    
    public void output() {
        System.out.println("Mã Hàng: " + maHang + " -- Tên Hàng: " + maHang + " -- Số Lượng: " + soLuong + " -- Đơn Giá: " + donGia);
        for(int i=0; i<soLuong; i++) {
            dsVl[i].Xuat();
        }
        System.out.println("--Tổng tiền: " + tongTien());
    }
    
    public float tongTien(){
        return soLuong*donGia;
    }
}