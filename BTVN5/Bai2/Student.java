package bai2;


import java.util.Scanner;
public class Student extends Person {

    protected String id;
    protected String class1;
    protected String school;

    Scanner sc = new Scanner(System.in);
    
    public Student() {
    }

    public Student(String name, Byte age, String address, Date birthday, String id, String class1, String school) {
        super(name, age, address, birthday);
        this.id = id;
        this.class1 = class1;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.printf("id: ");
        id = sc.nextLine();
        System.out.printf("class: ");
        class1 = sc.nextLine();
        System.out.printf("school: ");
        school = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Id: " + id);
        System.out.println("class: " + class1);
        System.out.println("School: " + school);
    }
}
