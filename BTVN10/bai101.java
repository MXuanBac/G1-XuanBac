package Bai101;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class bai101 {
    private static ArrayList<String> registeredUsernames = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Đăng ký tài khoản");
            System.out.println("2. Thoát");
            System.out.println("------------------------");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    registerAccount(scanner);
                    break;
                case 2:
                    return ;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    public static void registerAccount(Scanner scanner) {
        System.out.println("Đăng kí tài khoản");

        String userName;
        do {
            System.out.print("Nhập tên người dùng (ít nhất 6 kí tự bao gồm chữ cái thường và số, số không được đứng đầu): " );
            userName = scanner.nextLine();
        } while (!isValidUserName(userName));

        if (registeredUsernames.contains(userName)) {
            System.out.println("Tên tài khoản đã tồn tại. Hãy chọn tên khác...");
        }

        String password;
        do {
            System.out.print("Nhập mật khẩu (ít nhất 8 kí tự bất kì, có ít nhất 1 chữ cái thường, 1 chữ cái in hoa, 1 chữ số, 1 kí tự đặc biệt): " );
            password = scanner.nextLine();
        } while (!isValidPassword(password));

        if (registeredUsernames.contains(userName)) {
            System.out.println("Tên tài khoản đã tồn tại. Hãy chọn tên khác...");
        }

        registeredUsernames.add(userName);
        System.out.println("Đăng kí thành công...");
    }

    public static boolean isValidUserName(String username) {
        String regex = "^(?!\\d)([a-z0-9]){6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+-?/|]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
