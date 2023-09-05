package bai1;

import java.util.Scanner;
public class Dog extends Animal {
    protected String character;
    
    Scanner sc = new Scanner(System.in);

    public Dog() {
    }

    public Dog(String character, String name, Byte age, Float weight) {
        super(name, age, weight);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
    
    @Override
    public void input() {
        super.input();
        System.out.println("Tính cách: ");
        this.character = sc.nextLine();
    }
    
    @Override
    public void output() {
        System.out.println("--------------");
        super.output();
        System.out.println("Tính cách: " + character);
    }
    
    @Override
    public void tiengKeu() {
        System.out.println("Gau Gau");
    }
}
