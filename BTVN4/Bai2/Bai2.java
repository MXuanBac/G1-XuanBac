package bai2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong Sinh Vien: ");
        int n = sc.nextInt();

        Student sv[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("THONG TIN SV THU " + (i + 1));
            sv[i] = new Student();
            sv[i].Input();
        }

        System.out.printf("%-20s %-10s %-10s %-30s %-30s %-30s %-30s\n", "Họ và Tên", "Lớp", "Điểm", "Trường",
                "Ngày vào trường", "Khoa", "Ngày vào khoa");
        for (Student sinhvien : sv) {
            sinhvien.Output();
        }
        sc.close();
    }

}
