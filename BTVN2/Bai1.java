package bai1;
import java.util.Scanner;
public class Bai1 {
    public static int nhap() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    public static void nhap_Array(int a[], int n) {
        Scanner input = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            System.out.print("a[" + i +"]: "); 
            a[i] = input.nextInt();
        }
    }
    public static void check (int a[], int n) {
        for (int i=0; i<n; i++) {
            if (a[i]==-1) {
                continue;
            }

            int count = 1;
            for (int j=i+1; j<n; j++) {
                if (a[j]==a[i]) {
                    count++;
                    a[j] = -1;
                }
            }
            System.out.println(a[i] + ": xuat hien " + count + " lan.");
        }
    }
    
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap so luong phan tu: ");
            n = nhap();
            if(n < 1) System.out.print("Nhap lai: ");
        } while(n < 1);
        int a[] = new int[n];
        nhap_Array(a, n);
        check(a, n);
    }
    
}
