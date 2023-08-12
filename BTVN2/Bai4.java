package bai4;
import java.util.Scanner;
public class Bai4 {
    public static boolean check(String str) {
        int left=0;
        int right = str.length() - 1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++; 
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();
        if(check(input)) {
            System.out.println("Chuoi doi xung");
        }
        else {
            System.out.println("Chuoi khong doi xung");
        }
    }
}
