package bai2;

import java.util.Scanner;

public class Person {

    protected String name;
    protected Byte age;
    protected String address;
    protected Date birthday;

    public Person() {
    }

    public Person(String name, Byte age, String address, Date birthday) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("name: ");
        name = sc.nextLine();
        System.out.printf("age: ");
        age = sc.nextByte();
        sc.nextLine();
        System.out.printf("address: ");
        address = sc.nextLine();
        birthday = new Date();
        birthday.input();
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        birthday.output();
    }
}
