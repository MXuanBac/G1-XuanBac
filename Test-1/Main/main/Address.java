package main;

import java.util.Scanner;

public class Address {
    protected String city;
    protected String district;
    
    Scanner sc = new Scanner(System.in);

    public Address() {
    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
    public void input() {
        System.out.print("Nhap thanh pho: ");
        this.city = sc.nextLine();
        System.out.print("District: ");
        this.district = sc.nextLine();
    }
    
    public void output() {
        System.out.println("City: " + city + " -- District: " + district);
    }
}
