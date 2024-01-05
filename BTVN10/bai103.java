package Bai103;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai103 {

    public static void main(String[] args) {
	    String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập IPv4: ");
        String ip = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        if (matcher.matches()) {
            System.out.println("IPv4 hợp lệ");
        } else System.out.println("IPv4 không hợp lệ");
    }
}
