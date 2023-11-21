package BTVN.Bai2;

import java.util.Scanner;

public class Company {
    static Scanner sc = new Scanner(System.in);
    final private String nameSeller = "CÔNG TY TNHH A";
    final private String code = "010023400";
    final static String address = "45 phố X , quận Y , thành phố Hà Nội ";
    private String accountNumber;
    private String phoneNumber;

    public Company() {

    }

    public Company(String accountNumber, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getNameSeller() {
        return nameSeller;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void input(){
        System.out.print("Enter account number : ");
        this.accountNumber = sc.nextLine();
        System.out.print("Enter phone number : ");
        this.phoneNumber = sc.nextLine();
    }

    public void output(){
        System.out.println("Tên người bán : " + nameSeller + "                                                                       |");
        System.out.println("Mã số thuế : " + code + "                                                                               |");
        System.out.println("Địa chỉ : " + address + "                                                      |");
        System.out.println("Số tài khoản : " + getAccountNumber() + "                                                                                  |");
        System.out.println("Số điện thoại : " + getPhoneNumber() + "                                                                           |");
    }
}
