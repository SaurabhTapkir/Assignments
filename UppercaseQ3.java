//  Write Program to print Uppercase character present in array.
public class UppercaseQ3 {
    public static void main(String[] args)
    {
        char ch[]={'a','A','B','c','Z'};

        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                System.out.println(ch[i]);

            }
        }
    }
}
