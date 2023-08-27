package bai2;

import java.util.Scanner;

public class Faculty {

    private String Name;
    private String Date;
    private School x;

    Scanner input = new Scanner(System.in);

    public Faculty() {
    }

    public Faculty(String Name, String Date, School x) {
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public void Input() {
        x = new School();
        System.out.print("Nhap ten Truong: ");
        this.x.setName(input.nextLine());
        System.out.print("Ngay vao Truong: ");
        this.x.setDate(input.nextLine());
        System.out.print("Nhap ten Khoa: ");
        this.Name = input.nextLine();
        System.out.print("Nhap ngay vao Khoa: ");
        this.Date = input.nextLine();
    }

    public void Output() {
        System.out.printf("%-30s %-30s %-30s %-30s\n", this.x.getName(), this.x.getDate(), Name, Date);
    }
}
