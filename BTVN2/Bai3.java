package bai3;

import java.util.Scanner;

public class Bai3 {
    int nhap_n() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    
    void nhap_Array(int a[],  int n) {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("a[" +i+ "]: ");
            a[i] = input.nextInt();
        }
    }
    void xuat_Array(int a[]) {
        for(int value : a) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
    void Sap_xep(int a[], int n) {
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }
        } 
    }
    public static void main(String[] args) {
        Bai3 bai3 = new Bai3();
        int n;
        System.out.print("Nhap so luong phan tu: ");
        n  = bai3.nhap_n();
        int a[] = new int[n];
        bai3.nhap_Array(a, n);
        System.out.println("Mang truoc sap xep la: ");
        bai3.xuat_Array(a);
        bai3.Sap_xep(a, n);
        System.out.println("Mang sau khi sap xep la: ");
        bai3.xuat_Array(a);
    }
    
}
