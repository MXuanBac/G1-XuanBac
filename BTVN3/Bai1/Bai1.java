package bai1;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong sach: ");
        n = sc.nextInt();
        Book[] book = new Book[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Sach thu " + (i+1) + ": ");
            book[i] = new Book();
            book[i].input();
        }
        
        System.out.printf("%-10s%-20s%-15s%-15s%-10s%n", "Ma Sach", "Ten Sach", "Tac Gia", "Nha Xuat Ban", "Nam Xuat Ban");
        for(Book i: book) {
            i.output();
        }
    }   
}
