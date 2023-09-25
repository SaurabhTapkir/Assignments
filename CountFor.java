public class CountFor {
    public static void main(String[] args) {
        int c=0;
        for (int i=0;i<=100;i++)
        {
            if(i%3==0 && i%9==0)
            {
               
                System.out.println(c);
                 c++;
            }
            System.out.println(c);
        }
    }
}
