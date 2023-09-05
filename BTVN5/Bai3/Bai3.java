package bai3;

import java.util.Scanner;
import java.util.ArrayList;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Số Lượng Hàng Hóa: ");
        n = sc.nextInt();
        ArrayList<HangHoaDienTu> DT = new ArrayList<HangHoaDienTu>(n);
        ArrayList<HangHoaGiaDung> GD = new ArrayList<HangHoaGiaDung>(n);
        
        System.out.println("-----Nhập thông tin HH Gia Dụng...");
        for(int i = 0 ; i < n ; i++){
            System.out.println("----Hàng thứ " + (i + 1));
            HangHoaGiaDung hhGD = new HangHoaGiaDung();
            hhGD.input();
            GD.add(hhGD);
            System.out.println();
        }

        System.out.println("--------Nhap thong tin hang hoa dien tu---------");
        for (int i = 0 ; i < n ; i++){
            System.out.println("----thong tin hang hoa dien tu" + (i + 1));
            HangHoaDienTu hhDT = new HangHoaDienTu();
            hhDT.input();
            DT.add(hhDT);
            System.out.println();
        }

        System.out.println("========Thông tin các Mặt Hàng========");
        int i = 0;
        System.out.println("---Thông tin Hoàng Hóa Gia Dụng----");
        for (HangHoaGiaDung hangGD : GD){
            System.out.println("__Mặt hàng thứ " + (i+1) + "__");
            hangGD.output();
            ++i;
        }

        int j =0;
        System.out.println("______________________________________________");
        System.out.println("---Thông tin Hàng Hóa Điện Tử----");
        for (HangHoaDienTu hangDT : DT){
            System.out.println("__Mặt hàng thứ "+ (j+1) +"__");
            hangDT.output();
            ++j;
        }
    }
    
}
