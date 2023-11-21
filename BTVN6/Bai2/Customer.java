package BTVN.Bai2;

import java.util.Scanner;

public class Customer {
    static Scanner sc = new Scanner(System.in);
    private String customerFullName;
    private String customerName;
    private String address;
    private String accountNumber;
    private String payments;
    private String MST;
    final String cost = "VNĐ";

    public Customer(String customerFullName, String customerName, String address, String accountNumber, String payments, String MST) {
        this.customerFullName = customerFullName;
        this.customerName = customerName;
        this.address = address;
        this.accountNumber = accountNumber;
        this.payments = payments;
        this.MST = MST;
    }

    public Customer() {

    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public String getMST() {
        return MST;
    }

    public void setMST(String MST) {
        this.MST = MST;
    }

    public String getCost() {
        return cost;
    }

    public void input(){
        System.out.print("Enter full-name's customer: ");
        this.customerFullName = sc.nextLine();
        System.out.print("Enter name customer: ");
        this.customerName = sc.nextLine();
        System.out.print("Enter address's customer: ");
        this.address = sc.nextLine();
        System.out.print("Enter full card number's customer: ");
        this.accountNumber = sc.nextLine();
        System.out.print("Enter payments: ");
        this.payments = sc.nextLine();
        System.out.print("Enter MST: ");
        this.MST = sc.nextLine();
    }

    public void output(){
        System.out.println("Họ tên người mua hàng: " + getCustomerFullName() + "                                                             |");
        System.out.println("Tên người mua: " + getCustomerName() + "                                                                                 |");
        System.out.print("Địa chỉ: " + getAddress());
        System.out.println("                    Số tài khoản: " + getAccountNumber() + "                                       |");
        System.out.print("Hình thức thanh toán : " + getPayments());
        System.out.print("        MST: " + getMST());
        System.out.println("                        Đồng tiền thanh toán : " + getCost() + "           |");
    }

}
