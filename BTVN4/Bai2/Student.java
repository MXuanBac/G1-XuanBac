package bai2;

import java.util.Scanner;

public class Student {

    private String Name;
    private String Classs;
    private double Score;
    private Faculty y;

    Scanner sc = new Scanner(System.in);

    public Student() {
    }

    public Student(String Name, String Class, double Score, Faculty y) {
        this.Name = Name;
        this.Classs = Classs;
        this.Score = Score;
        this.y = y;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setClasss(String Classs) {
        this.Classs = Classs;
    }

    public String getClasss() {
        return Classs;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void Input() {
        y = new Faculty();
        System.out.print("Nhap Ten Sinh Vien: ");
        this.Name = sc.nextLine();
        System.out.print("Nhap Lop: ");
        this.Classs = sc.nextLine();
        System.out.print("Nhap Diem: ");
        this.Score = sc.nextDouble();
        this.y.Input();
    }

    public void Output() {
        System.out.printf("%-20s %-10s %-13s", Name, Classs, Score);
        y.Output();
    }

}
