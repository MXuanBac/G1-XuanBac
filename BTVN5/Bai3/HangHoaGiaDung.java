package bai3;
import java.util.Scanner;

public class HangHoaGiaDung extends hangHoa{
    protected String chucNang;
    Scanner sc = new Scanner(System.in);
    
    public HangHoaGiaDung() {
    }

    public HangHoaGiaDung(String chucNang, String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVl) {
        super(maHang, tenHang, soLuong, donGia, dsVl);
        this.chucNang = chucNang;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập chức năng Hàng Hóa: ");
        chucNang = sc.nextLine();
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("Chức năng Hàng Hóa: " + chucNang);
    }
}
