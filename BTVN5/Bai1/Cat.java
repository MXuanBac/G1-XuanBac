package bai1;

import java.util.Scanner;
public class Cat extends Animal {
    protected String color;
    protected String preferences;
    protected String ownerName;
    
    Scanner sc = new Scanner(System.in);

    public Cat() {
    }

    public Cat(String color, String preferences, String ownerName, String name, Byte age, Float weight) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    @Override
    public void input() {
        super.input();
        System.out.print("Màu sắc: ");
        this.color = sc.nextLine();
        System.out.print("Sở thích: ");
        this.preferences = sc.nextLine();
        System.out.print("Chủ sở hữu: ");
        this.ownerName = sc.nextLine();
    }
    
    @Override
    public void output() {
        System.out.println("--------------");
        super.output();
        System.out.println("Màu: " + color + " - Sở thích: " + preferences + " - Chủ sở hữu: " + ownerName);
    }
    
    @Override
    public void tiengKeu() {
        System.out.println("Meow");
    }
}
