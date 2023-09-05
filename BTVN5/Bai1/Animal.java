package bai1;

import java.util.Scanner;

public class Animal {
    protected String name;
    protected Byte age;
    protected Float  weight;

    Scanner sc = new Scanner(System.in);
    
    public Animal() {
    }

    public Animal(String name, Byte age, Float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
    
    public void input() {
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.print("Tuổi: ");
        this.age = sc.nextByte();
        System.out.print("Cân Nặng: ");
        this.weight = sc.nextFloat();
    }
    
    public void output() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Cân Nặng: " + weight);
    }
    
    public void tiengKeu() {
        System.out.println("Animal Sound");
    }
}
