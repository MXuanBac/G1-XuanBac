package bai2;

public class Bai2 {

    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.nhap();
        
        System.out.println("Chieu dai: " + hcn.getD());
        System.out.println("Chieu rong: " + hcn.getR());
        hcn.veHCN();
        System.out.println("Chu vi HCN: " + hcn.chuVi());
        System.out.println("Dien tich HCN: "+ hcn.dienTich());
    }
    
}
