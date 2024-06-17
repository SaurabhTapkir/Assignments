
//write program which check input is lover case vowel or upper case vowel or it is upercase ,lower case alphabate
import java.util.Scanner;

public class VowelOrAlphabate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The char");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is vowel in Lower Case");
            } else {
                System.out.println(ch + "is  Lower Case Alphabate:");
            }

        } else if ((ch >= 'A' && ch <= 'Z')) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is vowel in Upper Case:");
            } else {
                System.out.println(ch + " is UpperCaseZ Alphabate :");
            }

        } else {
            System.out.println("Invalid");
        }

    }

}
