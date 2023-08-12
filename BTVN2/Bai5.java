package bai5;
import java.util.Scanner;
public class Bai5 {
    public static String formatstr(String name) {
        name = name.toLowerCase();
        String str="";
        boolean check= true;
        for (int i=0 ;i<name.length() ; i++) {
            if (name.charAt(i)==' ') {
                check = true;
            } 
            else if (check && str.length()==0) {
                str += name.toUpperCase().charAt(i);
                check = false;
            }
            else if(check && str.length()>0){
                str += " " + name.toUpperCase().charAt(i);
                check=false;
            }
            else {
                str += name.charAt(i);
            }
        }

        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi ten: ");
        String inputStr = sc.nextLine();
        String formatted = formatstr(inputStr);
        System.out.println("Chuoi ten sau khi format: " + formatted);
    }
    
}
