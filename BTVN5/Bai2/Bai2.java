package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Số lượng SInh Viên: ");
        int n = input.nextInt();
        ArrayList<Student> a = new ArrayList<Student>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin Sinh Viên " + (i + 1));
            Student std = new Student();
            std.input();
            a.add(std);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------");
            Student student = a.get(i);
            student.output();
        }
    }
}
