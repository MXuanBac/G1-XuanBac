package main;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String gender;
    protected int age;

    Scanner sc = new Scanner(System.in);
    
    public Person() {
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void input() {
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        this.age = sc.nextInt();
        System.out.print("Nhap gioi tinh: ");
        this.gender = sc.nextLine();
    }
    
    public void output() {
        System.out.println("TEN: " + name);
        System.out.println("Tuoi: " + age + " Gioi tinh: " + gender);
    }
}
