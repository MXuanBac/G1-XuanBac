package testjava;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StudentServiceImpl std = new StudentServiceImpl();

    static void inputList() {
        sc.nextLine();
        System.out.print("Nhap ten Sinh Vien: ");
        String name = sc.nextLine();
        System.out.print("Nhap Tuoi: ");
        short age = sc.nextShort();
        sc.nextLine();
        System.out.print("Nhap Tinh: ");
        String district = sc.nextLine();
        System.out.println("Nhap Thanh Pho: ");
        String city = sc.nextLine();
        System.out.print("Nhap Diem: ");
        double score = sc.nextDouble();
        Address address = new Address(district, city);
        Student t = new Student(name, age, address, score);
        std.addStudent(t);
    }

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("============MENU=============");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Xoa sinh vien theo id");
            System.out.println("3. Tim sinh vien theo ten");
            System.out.println("4. Sap xep sinh vien theo diem giam dan");
            System.out.println("5. Hien thi toan bo danh sach sinh vien");
            System.out.println("6. Exit......");
            System.out.println("-----------------------------");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputList();
                    break;
                case 2:
                    int key;
                    System.out.println("Nhap ID sinh vien: ");
                    key = sc.nextInt();
                    std.deleteStudent(key);
                    System.out.println("Xoa Sinh Vien thanh cong");
                    break;
                case 3:
                    System.out.println("Nhap ten sinh vien muon tim: ");
                    String name = sc.nextLine();
                    std.searchStudent(name);
                    break;
                case 4:
                    std.sortedStudent();
                    std.showALlStudent();
                    break;
                case 5:
                    std.showALlStudent();
                    break;
                case 6:
                    return ;
                default:
                    System.out.println("Nhap tu 1 den 6");
            }
        } while (choice > 0);
    }
}
