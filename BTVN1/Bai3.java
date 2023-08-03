package bai3;
import java.util.Scanner;

public class Bai3 {
    public static boolean isPrime(int n)
    {
        int Dem=0;
        if (n==0 || n==1) Dem =0;
        else 
        {
            for(int i=1; i<=n; i++)
            {
                if(n%i == 0)
                {
                    Dem ++;
                }
            }
        }
        if (Dem==2) return true;
        else return false;
    }
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Nhap mot so nguyen duong: ");
           int n;
           do {
               n = input.nextInt();
               if(n<0) System.out.println("Nhap lai: ");
           } while(n<0);
           System.out.println( isPrime(n) == true ? n +" la so nguyen to" : n +" khong phai la so nguyen to");
    }
    
}
