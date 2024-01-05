package Bai104;

public class bai104 {

    public static void main(String[] args) {
	    String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        /*      ^ : Bắt đầu chuỗi

                [\w!#$%&’*+/=?`{|}~^-] : Bắt đầu bằng chữ cái hoặc số hoặc kí tự đặc biệt

                +(?:\.[\w!#$%&’*+/=?`{|}~^-]+)* : Sau chuỗi đằng trước là dấu chấm sau dấu chấm cũng
                                                  là một chuỗi chứa số, chữ hoặc các kí tự đặc biệt

                @(?:[a-zA-Z0-9-]+\\.) : kí tự @ phân tách với phần trước và phần sau @ là các chữ cái,
                                        chữ số hoặc dấu gạch ngang được phân tách bởi dấu chấm

                [a-zA-Z]{2,6}$ : Phần cuối cùng cảu tên miền, có thể chứa từ 2 đến 6 kí tự chữ cái viết thường hoặc viết hoa
        */
    }
}
