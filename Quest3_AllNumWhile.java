//print odd all number from 1 to n while loop

public class Quest3_AllNumWhile {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 50) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
