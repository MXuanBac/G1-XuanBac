package bai2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<May> may = new ArrayList<>();
        QuanLy quanly = new QuanLy();
        Scanner s = new Scanner(System.in);
        PhongMay phongmay = new PhongMay();
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1: Input information of Room Machine");
            System.out.println("2: Output informaiton of Machine");
            System.out.println("3: Search Machine by Type of Machine");
            System.out.println("4: Search Machine by ID of Machine");
            System.out.println("0: Exit menu");
            System.out.println("");
            System.out.print("Your choice: ");
            int choice = s.nextInt();
            s.nextLine();
            System.out.println("");
            switch (choice) {
                case 1: {
                    System.out.println("");
                    phongmay.nhap();
                    quanly.nhap();
                    System.out.print("Number of machine: ");
                    phongmay.setN(s.nextInt());
                    for (int i = 0; i < phongmay.getN(); i++) {
                        System.out.println("Machine " + (i + 1) + ": ");
                        May com = new May();
                        com.nhap();
                        may.add(com);
                    }
                    break;
                }
                case 2: {
                    System.out.print("");
                    phongmay.xuat();
                    quanly.xuat();
                    for(May com: may){
                        com.xuat();
                    }
                    break;
                }
                case 3:{               
                    System.out.println("");
                    System.out.print("Enter Type of Machine: ");
                    String kieumay = s.nextLine();
                    phongmay.searchByTypeOfMachine(kieumay);
                    break;
                }
                case 4:{
                    System.out.print("Enter ID of Machine: ");
                    int mamay = s.nextInt();
                    s.nextLine();
                    phongmay.searchByIDMachine(mamay);
                    break;
                }
                case 0: {
                    System.out.println("");
                    System.out.println("Exit...");
                    return;
                }
                default:
                    break;
            }
        }
    }
}