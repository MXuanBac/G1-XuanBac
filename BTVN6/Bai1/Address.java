package BTVN.Bai1;
import java.util.Scanner;

public class Address {
    static Scanner sc = new Scanner(System.in);
    public String commune;
    public String district;
    public String city;

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public Address() {

    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input(){
        System.out.print("Enter commune : ");
        this.commune = sc.nextLine();
        System.out.print("Enter district : ");
        this.district = sc.nextLine();
        System.out.print("Enter city : ");
        this.city = sc.nextLine();
    }

    public void output(){
        System.out.printf("%-15s %-10s %-10s" , this.commune , this.district , this.city);
    }

}