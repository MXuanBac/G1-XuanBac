
package bai5;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap so qua chanh: "); a= s.nextInt();
        System.out.println("Nhap so qua tao: "); b= s.nextInt();
        System.out.println("Nhap so qua le: "); c=s.nextInt();
        if(a==0 || b==0 || c==0) System.out.println("Khong the pha che Siro");
        else
        {
            int sum =0;
            int temp= (c/4)*4;
            if(a>=temp/4 && b>=temp/2)
            {
                sum = temp/4 +temp/2 +temp;
            }
            else if(a<temp/4 && b>=2*a)
            {
                sum = a +2*a +4*a;
            }
            else if(b<temp/2 && b>=2*a)
            {
                sum = b/2 +b + b*2;
            } else sum = 0;
            if(sum >0)
            {
                System.out.println("Tong so qua toi da la: " +sum);
            }
        }
    }
    
}
