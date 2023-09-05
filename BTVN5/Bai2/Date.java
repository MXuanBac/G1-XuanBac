package bai2;

import java.util.Scanner;

public class Date {

    private int year;
    private Byte month;
    private Byte day;

    public Date() {
    }

    public Date(int year, Byte month, Byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public int getmonth() {
        return month;
    }

    public void setmonth(Byte month) {
        this.month = month;
    }

    public int getday() {
        return day;
    }

    public void setday(Byte day) {
        this.day = day;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập Năm: ");
        year = s.nextInt();
        System.out.print("Tháng: ");
        month = s.nextByte();
        System.out.print("Ngày: ");
        day = s.nextByte();
    }

    public void output() {
        System.out.println("year : " + year);
        System.out.println("month : " + month);
        System.out.println("day : " + day);
    }
}
