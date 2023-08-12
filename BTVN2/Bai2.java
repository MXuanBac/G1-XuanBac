package bai2;
import java.util.Scanner;
public class Bai2 {
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
        System.out.println("Ket Qua: ");
        for(int value : a) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
    int[] insertIndex(int a[], int index, int value) {
        int n=a.length;
        int  arr[] = new  int[n+1];
        for(int i=0, j=0; i<n+1; i++) {
            if(i == index-1) arr[i]=value;
            else  {
                arr[i] = a[j];
                j++;
            }
        } 
        return arr;
    }
    int[] removeIndex(int a[], int removeIndex)
    {
        int n=a.length;
        int arr[] = new int[n-1];
        for(int i=0, j=0; i<n; i++) {
            if(i != removeIndex-1) {
                arr[j] = a[i];
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bai2 bai2 = new Bai2();
        int n, value, index, removeIndex;
        do {
            System.out.print("Nhap so luong phan tu trong mang: ");
            n = bai2.nhap_n();
            if(n < 1) System.out.print("Nhap lai: ");
        } while(n < 1);
        int a[] = new int[n];
        bai2.nhap_Array(a, n);
        bai2.xuat_Array(a);
        // Chen them phan tu
        do {
            System.out.print("Nhap vi tri can chen: ");
            index = input.nextInt();
            if(index<0 || index >n) System.out.print("Nhap lai: ");
        } while(index<0 || index >n);
        System.out.print("Nhap gia tri chen: "); 
        value = input.nextInt();
        a = bai2.insertIndex(a, index, value);
        bai2.xuat_Array(a);
        // Xoa phan tu o 1 vi tri trong mang
        do{
            System.out.print("Nhap vi tri can xoa: ");
            removeIndex = input.nextInt();
            if(removeIndex<0 || removeIndex >n) System.out.print("Nhap lai: ");
        } while(removeIndex<0 || removeIndex >n);
        a = bai2.removeIndex(a, removeIndex);
        bai2.xuat_Array(a);
    }
}
