package bai1;

public class Bai1 {
    
    public static void main(String[] args) {
        System.out.println("Thông tin MÈO");
        Cat cat = new Cat();
        cat.input();
        cat.output();
        cat.tiengKeu();
        System.out.println("Thông tin CHÓ");
        Dog dog = new Dog();
        dog.input();
        dog.output();
        dog.tiengKeu();
    }
    
}
