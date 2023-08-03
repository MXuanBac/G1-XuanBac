package bai2;
import java.util.Scanner;

public class Bai2 {
    public static long giaiThua(int n)
    {
        long gt=1;
        for(int i=1; i<=n; i++)
        {gt*=i;}
        return gt;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Nhap mot so nguyen duong: ");
        do {
            n = input.nextInt();
            if(n<=0) System.out.println("Nhap lai: ");
        } while(n<=0);
        long P=0;
        double S=0;
        for(int i=1; i<=n; i++)
        {
            S += (float)1/i;
            P += giaiThua(i);
        }
        System.out.println("Tong S= " +S);
        System.out.println("Tong P= " +P);
    }
}
