package bai4;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a, b, c;
        System.out.println("Nhap so a: "); a= s.nextFloat();
        System.out.println("Nhap so b: "); b= s.nextFloat();
        System.out.println("Nhap so c: "); c= s.nextFloat();
        float delta;
        delta = b*b - 4*a*c;
        if(delta < 0) System.out.println("Phuong trinh vo nghiem");
        else if(delta == 0)
        {
            double x1 = Math.sqrt(-b/(2*a)), x2 = -Math.sqrt(-b/(2*a));
            System.out.println("Phuong trinh " +a+ "x^4 " +b+ "x^2 " +c+ " co ca nghiem la: ");
            System.out.println("x1= " +x1);
            System.out.println("x2= " +x2);
        }
        else
        {
            double x1=(-b+Math.sqrt(delta))*1.0/(2*a);
            double x2=(-b-Math.sqrt(delta))*1.0/(2*a);
            System.out.println("Phuong trinh " +a+ "x^4 " +b+ "x^2 " +c+ " co ca nghiem la: ");
            System.out.println("x1= " +Math.sqrt(x1));
            System.out.println("x2= " +(-Math.sqrt(x1)));
            System.out.println("x3= " +Math.sqrt(x2));
            System.out.println("x4= " +(-Math.sqrt(x2)));
        }
    }
    
}
