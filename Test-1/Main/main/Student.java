package main;

import java.util.Scanner;

public class Student extends Person {
    protected int id;
    protected Address address;
    protected double gpa;
    
    Scanner sc = new Scanner(System.in);
    public Student() {
    }

    public Student(int id, Address address, double gpa, String name, String gender, int age) {
        super(name, gender, age);
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public void input() {
        super.input();
        System.out.print("Nhap ID: ");
        id = sc.nextInt();
        System.out.print("Nhap Dia chi: ");
        address.input();
        System.out.print("Nhap GPA: ");
        gpa = sc.nextDouble();
    }
    
    @Override
    public void output() {
        System.out.println("ID: " + id);
        super.output();
        System.out.println("Dia chi: ");
        address.output();
        System.out.println("GPA: " + gpa);
    }

    boolean indexOf(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
