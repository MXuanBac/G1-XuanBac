package BTVN.Bai2;

public class Main {
    static Company company = new Company();
    static Customer customer = new Customer();
    static Products products = new Products();
    public static void main(String[] args) {
        company.input();
        customer.input();
        products.input();
        System.out.printf("%70s\n", "HÓA ĐƠN BÁN HÀNG");
        products.output();
    }
}
