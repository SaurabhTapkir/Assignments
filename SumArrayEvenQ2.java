//Write The Summation of Number Which is Even number present in array
public class SumArrayEvenQ2 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
            //System.out.println(a[i]);
        }
        System.out.println(sum);
    }
}
