package bai2;
import java.util.Scanner;

public class HCN {
    private float D;
    private float R;

    public float getD() {
	return D;
    }

    public void setD() {
	this.D = D;
    }

    public float getR() {
	return R;
    }

    public void setR() {
        this.R = R;
    }

    public HCN() {
    }

    public HCN(float D, float R) {
        this.D = D;
        this.R = R;
    }
    
    public void nhap() {
    Scanner sc = new Scanner(System.in);

    do {
	System.out.print("Nhap chieu dai: ");
	D = sc.nextFloat();
	System.out.print("Nhap chieu rong: ");
	R = sc.nextFloat();
	if (D < R || D <=0 || R <=0)
            System.out.println("Khong hop le hay nhap lai!");
	} while (D < R || D <=0 || R <=0);
    }

    public void veHCN() {
    	for (float i = 0; i < R; i++) {
            for (float j = 0; j < D; j++)
		System.out.print("* ");
        	System.out.println();
	}
    }

    public float chuVi() {
	return (D + R) * 2;
    }

    public float dienTich() {
	return D * R;
    }
}
